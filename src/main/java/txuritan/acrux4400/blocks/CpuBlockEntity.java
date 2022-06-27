package txuritan.acrux4400.blocks;

import txuritan.acrux4400.Acrux4400;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class CpuBlockEntity extends BlockEntity {
    public CpuBlockEntity(BlockPos pos, BlockState state) {
        super(Acrux4400.CPU_BLOCK_ENTITY_TYPE, pos, state);
    }
}
