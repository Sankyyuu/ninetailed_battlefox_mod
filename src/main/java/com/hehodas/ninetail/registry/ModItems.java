package com.hehodas.ninetail.registry;

import com.hehodas.ninetail.Ninetail;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item UME_FLOWER = new Item(new Item.Settings().group(ItemGroup.DECORATIONS));

    //Block Items
    public static final BlockItem UME_FLOWER_BLOCK = new BlockItem(ModBlocks.UME_FLOWER_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem KAMI_UME_FLOWER_BLOCK = new BlockItem(ModBlocks.KAMI_UME_FLOWER_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem KAMI_YUME_FLOWER_BLOCK = new BlockItem(ModBlocks.KAMI_YUME_FLOWER_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Ninetail.MOD_ID, "ume_flower"), UME_FLOWER);
        Registry.register(Registry.ITEM, new Identifier(Ninetail.MOD_ID, "ume_flower_block"), UME_FLOWER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Ninetail.MOD_ID, "kami_ume_flower_block"), KAMI_UME_FLOWER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Ninetail.MOD_ID, "kami_yume_flower_block"), KAMI_YUME_FLOWER_BLOCK);
    }
}
