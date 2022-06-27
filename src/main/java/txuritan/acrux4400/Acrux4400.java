package txuritan.acrux4400;

import txuritan.acrux4400.blocks.BackplaneBlock;
import txuritan.acrux4400.blocks.CpuBlock;
import txuritan.acrux4400.blocks.CpuBlockEntity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Acrux4400 implements ModInitializer {
    private static final String MODID = "acrux_4400";

    public static final CpuBlock CPU_BLOCK = new CpuBlock(FabricBlockSettings.of(Material.METAL).hardness(3.0f).resistance(12.0f));
    public static final BlockItem CPU_BLOCK_ITEM = new BlockItem(CPU_BLOCK, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static BlockEntityType<CpuBlockEntity> CPU_BLOCK_ENTITY_TYPE;

    public static final BackplaneBlock BACKPLANE_BLOCK = new BackplaneBlock(FabricBlockSettings.of(Material.METAL).hardness(1.5f).resistance(6.0f));
    public static final BlockItem BACKPLANE_ITEM = new BlockItem(BACKPLANE_BLOCK, new FabricItemSettings().group(ItemGroup.REDSTONE));
    // public static BlockEntityType<CpuBlockEntity> BACKPLANE_BLOCK_ENTITY_TYPE;

    private static Identifier id(String path) {
        return new Identifier(MODID, path);
    }

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, id("cpu"), CPU_BLOCK);
        Registry.register(Registry.ITEM, id("cpu"), CPU_BLOCK_ITEM);
        CPU_BLOCK_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, id("cpu_entity"), FabricBlockEntityTypeBuilder.create(CpuBlockEntity::new, CPU_BLOCK).build(null));

        Registry.register(Registry.BLOCK, id("backplane"), BACKPLANE_BLOCK);
        Registry.register(Registry.ITEM, id("backplane"), BACKPLANE_ITEM);
        // CPU_BLOCK_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, id("cpu_entity"), FabricBlockEntityTypeBuilder.create(CpuBlockEntity::new, CPU_BLOCK).build(null));
    }
}
