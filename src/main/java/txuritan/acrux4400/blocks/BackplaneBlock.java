package txuritan.acrux4400.blocks;

import txuritan.acrux4400.Acrux4400;
import txuritan.acrux4400.utils.WorldUtils;

import com.google.common.collect.BiMap;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;
import java.util.Objects;

@SuppressWarnings("deprecation")
public class BackplaneBlock extends HorizontalFacingBlock {
    public static final IntProperty STATE = IntProperty.of("state", 0, 1);

    protected static final Map<Integer, Pair<VoxelShape, Block>> STATE_TO_BLOCK = Map.of(
        0, Pair.of(Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), null),
        1, Pair.of(VoxelShapes.fullCube(), Acrux4400.RAM_MODULE_BLOCK)
    );
    protected static final Map<Block, Integer> BLOCK_TO_STATE = Map.of(
        Acrux4400.RAM_MODULE_BLOCK, 1
    );

    public BackplaneBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(STATE, 0));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING, STATE);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return STATE_TO_BLOCK.get(state.get(STATE)).getLeft();
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return !world.isAir(pos.down());
    }

    // Disable mob pathing for the backplane if it has a block on it
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return state.get(STATE) != 0;
    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        Block block = STATE_TO_BLOCK.get(state.get(STATE)).getRight();

        return new ItemStack(Objects.requireNonNullElse(block, this));

    }

    // Handle the player placing a backplane module
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(STATE) != 0) {
            return ActionResult.FAIL;
        }

        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        if (BLOCK_TO_STATE.containsKey(item)) {
            if (!player.isCreative()) {
                itemStack.decrement(1);
            }

            world.playSound(player, pos, SoundEvents.BLOCK_METAL_PLACE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            world.setBlockState(pos, state.with(STATE, BLOCK_TO_STATE.get(item)));
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            player.incrementStat(Stats.USED.getOrCreateStat(item));
        }

        return ActionResult.SUCCESS;
    }

    // Custom handler for drop the one or two blocks that make up a backplane
    public boolean beforeBreak(World world, PlayerEntity player, BlockPos pos, BlockState state) {
        if (state.get(STATE) == 0) {
            return true;
        }

        if (!world.isClient) {
            if (!player.isCreative()) {
                Block block = STATE_TO_BLOCK.get(state.get(STATE)).getRight();

                WorldUtils.dropItemStack((ServerWorld) world, pos, block.asItem().getDefaultStack());
            }

            world.playSound(player, pos, SoundEvents.BLOCK_METAL_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
            world.setBlockState(pos, state.with(STATE, 0));
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        }

        return true;
    }
}
