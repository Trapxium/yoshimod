package com.trapxium.tutorial.block;
import com.trapxium.tutorial.TutorialMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import com.trapxium.tutorial.item.ModItems;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static final Block yoshiegg = new Block(FabricBlockSettings.create().strength(4.0f));
}
