package dev.intelligentcreations.ezconvertorz.blocks;

import aztech.modern_industrialization.ModernIndustrialization;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final EEUConvertorBlock EEU_CONVERTOR = new EEUConvertorBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final EUEConvertorBlock EUE_CONVERTOR = new EUEConvertorBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("ezconvertorz", "eeu"), EEU_CONVERTOR);
        Registry.register(Registry.ITEM, new Identifier("ezconvertorz", "eeu"), new BlockItem(EEU_CONVERTOR, new Item.Settings().group(ModernIndustrialization.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("ezconvertorz", "eue"), EUE_CONVERTOR);
        Registry.register(Registry.ITEM, new Identifier("ezconvertorz", "eue"), new BlockItem(EUE_CONVERTOR, new Item.Settings().group(ModernIndustrialization.ITEM_GROUP)));
    }
}
