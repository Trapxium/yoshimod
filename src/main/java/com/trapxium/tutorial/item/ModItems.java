package com.trapxium.tutorial.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import com.trapxium.tutorial.TutorialMod;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.trapxium.tutorial.block.ModBlock;

public class ModItems {
    public static final Item beegyoshi = registerItem("beegyoshi", new Item(new FabricItemSettings()));
    public static final Item yoshiegg = registerBlockItem("yoshiegg", ModBlock.yoshiegg);
    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(beegyoshi);
        entries.add(yoshiegg);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID,name),item);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID,name),new BlockItem(block,new FabricItemSettings()));
    }
    public static void registeredModItems(){
        TutorialMod.LOGGER.info("registering item for "+ TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
