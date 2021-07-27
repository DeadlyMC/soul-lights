package me.deadlymc.soullights.registry;

import me.deadlymc.soullights.block.SoulCandleBlock;
import me.deadlymc.soullights.block.SoulCandleCakeBlock;
import me.deadlymc.soullights.block.SoulCarvedPumpkinBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.deadlymc.soullights.SoulLights.MODID;
import static me.deadlymc.soullights.block.SoulCandleBlock.STATE_TO_LUMINANCE;

public class SoulLightsBlocks
{
    public static final Block SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.PALE_YELLOW).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block WHITE_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.WHITE_GRAY).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block ORANGE_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.ORANGE).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block MAGENTA_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.MAGENTA).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block LIGHT_BLUE_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.LIGHT_BLUE).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block YELLOW_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.YELLOW).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block LIME_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.LIME).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block PINK_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.PINK).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block GRAY_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.GRAY).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block LIGHT_GRAY_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.LIGHT_GRAY).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block CYAN_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.CYAN).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block PURPLE_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.PURPLE).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block BLUE_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.BLUE).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block BROWN_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.BROWN).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block GREEN_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.GREEN).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block RED_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.RED).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));
    public static final Block BLACK_SOUL_CANDLE = new SoulCandleBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.BLACK).nonOpaque().strength(0.1F).sounds(BlockSoundGroup.CANDLE).luminance(STATE_TO_LUMINANCE));

    public static final Block SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(SOUL_CANDLE, FabricBlockSettings.copy(Blocks.CAKE).luminance(state -> (Boolean)state.get(Properties.LIT) ? 2 : 0));
    public static final Block WHITE_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(WHITE_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block ORANGE_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(ORANGE_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block MAGENTA_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(MAGENTA_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block LIGHT_BLUE_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(LIGHT_BLUE_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block YELLOW_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(YELLOW_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block LIME_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(LIME_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block PINK_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(PINK_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block GRAY_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(GRAY_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block LIGHT_GRAY_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(LIGHT_GRAY_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block CYAN_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(CYAN_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block PURPLE_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(PURPLE_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block BLUE_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(BLUE_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block BROWN_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(BROWN_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block GREEN_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(GREEN_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block RED_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(RED_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));
    public static final Block BLACK_SOUL_CANDLE_CAKE = new SoulCandleCakeBlock(BLACK_SOUL_CANDLE, FabricBlockSettings.copy(SOUL_CANDLE_CAKE));

    public static final Block SOUL_O_LANTERN = new SoulCarvedPumpkinBlock(FabricBlockSettings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance(state -> 11));

    public static void register()
    {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "soul_candle"), SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "white_soul_candle"), WHITE_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "orange_soul_candle"), ORANGE_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "magenta_soul_candle"), MAGENTA_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "light_blue_soul_candle"), LIGHT_BLUE_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "yellow_soul_candle"), YELLOW_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_soul_candle"), LIME_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "pink_soul_candle"), PINK_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "gray_soul_candle"), GRAY_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "light_gray_soul_candle"), LIGHT_GRAY_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "cyan_soul_candle"), CYAN_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_soul_candle"), PURPLE_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "blue_soul_candle"), BLUE_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "brown_soul_candle"), BROWN_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "green_soul_candle"), GREEN_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "red_soul_candle"), RED_SOUL_CANDLE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "black_soul_candle"), BLACK_SOUL_CANDLE);

        Registry.register(Registry.BLOCK, new Identifier(MODID, "soul_candle_cake"), SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "white_soul_candle_cake"), WHITE_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "orange_soul_candle_cake"), ORANGE_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "magenta_soul_candle_cake"), MAGENTA_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "light_blue_soul_candle_cake"), LIGHT_BLUE_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "yellow_soul_candle_cake"), YELLOW_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_soul_candle_cake"), LIME_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "pink_soul_candle_cake"), PINK_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "gray_soul_candle_cake"), GRAY_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "light_gray_soul_candle_cake"), LIGHT_GRAY_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "cyan_soul_candle_cake"), CYAN_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "purple_soul_candle_cake"), PURPLE_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "blue_soul_candle_cake"), BLUE_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "brown_soul_candle_cake"), BROWN_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "green_soul_candle_cake"), GREEN_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "red_soul_candle_cake"), RED_SOUL_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "black_soul_candle_cake"), BLACK_SOUL_CANDLE_CAKE);

        Registry.register(Registry.BLOCK, new Identifier(MODID, "soul_o_lantern"), SOUL_O_LANTERN);
    }
}
