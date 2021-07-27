package me.deadlymc.soullights.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.deadlymc.soullights.SoulLights.MODID;
import static me.deadlymc.soullights.registry.SoulLightsBlocks.*;

public class SoulLightsItems
{
    public static void register()
    {
        Registry.register(Registry.ITEM, new Identifier(MODID, "soul_candle"), new BlockItem(SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "white_soul_candle"), new BlockItem(WHITE_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "orange_soul_candle"), new BlockItem(ORANGE_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "magenta_soul_candle"), new BlockItem(MAGENTA_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "light_blue_soul_candle"), new BlockItem(LIGHT_BLUE_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "yellow_soul_candle"), new BlockItem(YELLOW_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "lime_soul_candle"), new BlockItem(LIME_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "pink_soul_candle"), new BlockItem(PINK_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "gray_soul_candle"), new BlockItem(GRAY_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "light_gray_soul_candle"), new BlockItem(LIGHT_GRAY_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "cyan_soul_candle"), new BlockItem(CYAN_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "purple_soul_candle"), new BlockItem(PURPLE_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "blue_soul_candle"), new BlockItem(BLUE_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "brown_soul_candle"), new BlockItem(BROWN_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "green_soul_candle"), new BlockItem(GREEN_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "red_soul_candle"), new BlockItem(RED_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "black_soul_candle"), new BlockItem(BLACK_SOUL_CANDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM, new Identifier(MODID, "soul_o_lantern"), new BlockItem(SOUL_O_LANTERN, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
