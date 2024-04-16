package com.trapxium.tutorial;
import com.trapxium.tutorial.block.ModBlock;
import com.trapxium.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TutorialMod implements ModInitializer {
    public static final String MOD_ID="tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");
    @Override
    public void onInitialize() {
        ModItems.registeredModItems();
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "yoshiegg"),ModBlock.yoshiegg);

    }
}