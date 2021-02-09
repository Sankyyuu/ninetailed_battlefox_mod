package com.hehodas.ninetail.registry;

import com.hehodas.ninetail.Ninetail;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class ModBlocks {

    public static final FlowerBlock UME_FLOWER_BLOCK = new FlowerBlock(StatusEffects.LUCK,0,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID).luminance(ToIntFunction->4));
    public static final FlowerBlock KAMI_UME_FLOWER_BLOCK = new FlowerBlock(StatusEffects.LUCK,0,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID).luminance(ToIntFunction->8));
    public static final FlowerBlock KAMI_YUME_FLOWER_BLOCK = new FlowerBlock(StatusEffects.LUCK,0,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID).luminance(ToIntFunction->12));
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Ninetail.MOD_ID, "ume_flower_block"), UME_FLOWER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Ninetail.MOD_ID, "kami_ume_flower_block"), KAMI_UME_FLOWER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Ninetail.MOD_ID, "kami_yume_flower_block"), KAMI_YUME_FLOWER_BLOCK);
    }

}
