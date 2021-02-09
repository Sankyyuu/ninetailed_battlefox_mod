package com.hehodas.ninetail;

import com.hehodas.ninetail.registry.ModBlocks;
import com.hehodas.ninetail.registry.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.FlowerBlock;
import net.minecraft.client.render.RenderLayer;

public class Ninetail implements ModInitializer {
    public static final String MOD_ID = "ninetail";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
