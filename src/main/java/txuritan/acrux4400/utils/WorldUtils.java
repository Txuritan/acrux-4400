package txuritan.acrux4400.utils;

import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.stream.Stream;

public class WorldUtils {
    public static void dropItemStack(ServerWorld world, BlockPos pos, ItemStack itemStack) {
        float scale = 0.7f;

        double xOffset = world.getRandom().nextFloat() * scale + 1f - scale * 0.5;
        double yOffset = world.getRandom().nextFloat() * scale + 1f - scale * 0.5;
        double zOffset = world.getRandom().nextFloat() * scale + 1f - scale * 0.5;

        ItemEntity entityItem = new ItemEntity(world, pos.getX() + xOffset, pos.getY() + yOffset, pos.getZ() + zOffset, itemStack);
        entityItem.setPickupDelay(10);

        world.addEntities(Stream.of(entityItem));
    }
}
