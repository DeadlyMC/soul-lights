package me.deadlymc.soullights.registry;

import me.deadlymc.soullights.block.SoulCandleBlock;
import me.deadlymc.soullights.block.SoulCandleCakeBlock;
import me.deadlymc.soullights.block.SoulCarvedPumpkinBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static me.deadlymc.soullights.SoulLights.MODID;
import static me.deadlymc.soullights.block.SoulCandleBlock.STATE_TO_LUMINANCE;

public class SoulLightsBlocks
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<SoulCandleBlock> SOUL_CANDLE = BLOCKS.register("soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.SAND).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> WHITE_SOUL_CANDLE = BLOCKS.register("white_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.WOOL).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> ORANGE_SOUL_CANDLE = BLOCKS.register("orange_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_ORANGE).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> MAGENTA_SOUL_CANDLE = BLOCKS.register("magenta_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_MAGENTA).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> LIGHT_BLUE_SOUL_CANDLE = BLOCKS.register("light_blue_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_BLUE).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> YELLOW_SOUL_CANDLE = BLOCKS.register("yellow_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_YELLOW).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> LIME_SOUL_CANDLE = BLOCKS.register("lime_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_GREEN).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> PINK_SOUL_CANDLE = BLOCKS.register("pink_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_PINK).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> GRAY_SOUL_CANDLE = BLOCKS.register("gray_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_GRAY).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> LIGHT_GRAY_SOUL_CANDLE = BLOCKS.register("light_gray_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_GRAY).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> CYAN_SOUL_CANDLE = BLOCKS.register("cyan_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_CYAN).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> PURPLE_SOUL_CANDLE = BLOCKS.register("purple_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_PURPLE).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> BLUE_SOUL_CANDLE = BLOCKS.register("blue_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLUE).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> BROWN_SOUL_CANDLE = BLOCKS.register("brown_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BROWN).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> GREEN_SOUL_CANDLE = BLOCKS.register("green_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_GREEN).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> RED_SOUL_CANDLE = BLOCKS.register("red_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_RED).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));
    public static final RegistryObject<SoulCandleBlock> BLACK_SOUL_CANDLE = BLOCKS.register("black_soul_candle", () -> new SoulCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLACK).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(STATE_TO_LUMINANCE)));

    public static final RegistryObject<SoulCandleCakeBlock> SOUL_CANDLE_CAKE = BLOCKS.register("soul_candle_cake", () -> new SoulCandleCakeBlock(SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CAKE).lightLevel(state -> (Boolean)state.getValue(BlockStateProperties.LIT) ? 2 : 0)));
    public static final RegistryObject<SoulCandleCakeBlock> WHITE_SOUL_CANDLE_CAKE = BLOCKS.register("white_soul_candle_cake", () -> new SoulCandleCakeBlock(WHITE_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> ORANGE_SOUL_CANDLE_CAKE = BLOCKS.register("orange_soul_candle_cake", () -> new SoulCandleCakeBlock(ORANGE_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> MAGENTA_SOUL_CANDLE_CAKE = BLOCKS.register("magenta_soul_candle_cake", () -> new SoulCandleCakeBlock(MAGENTA_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> LIGHT_BLUE_SOUL_CANDLE_CAKE = BLOCKS.register("light_blue_soul_candle_cake", () -> new SoulCandleCakeBlock(LIGHT_BLUE_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> YELLOW_SOUL_CANDLE_CAKE = BLOCKS.register("yellow_soul_candle_cake", () -> new SoulCandleCakeBlock(YELLOW_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> LIME_SOUL_CANDLE_CAKE = BLOCKS.register("lime_soul_candle_cake", () -> new SoulCandleCakeBlock(LIME_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> PINK_SOUL_CANDLE_CAKE = BLOCKS.register("pink_soul_candle_cake", () -> new SoulCandleCakeBlock(PINK_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> GRAY_SOUL_CANDLE_CAKE = BLOCKS.register("gray_soul_candle_cake", () -> new SoulCandleCakeBlock(GRAY_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> LIGHT_GRAY_SOUL_CANDLE_CAKE = BLOCKS.register("light_gray_soul_candle_cake", () -> new SoulCandleCakeBlock(LIGHT_GRAY_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> CYAN_SOUL_CANDLE_CAKE = BLOCKS.register("cyan_soul_candle_cake", () -> new SoulCandleCakeBlock(CYAN_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> PURPLE_SOUL_CANDLE_CAKE = BLOCKS.register("purple_soul_candle_cake", () -> new SoulCandleCakeBlock(PURPLE_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> BLUE_SOUL_CANDLE_CAKE = BLOCKS.register("blue_soul_candle_cake", () -> new SoulCandleCakeBlock(BLUE_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> BROWN_SOUL_CANDLE_CAKE = BLOCKS.register("brown_soul_candle_cake", () -> new SoulCandleCakeBlock(BROWN_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> GREEN_SOUL_CANDLE_CAKE = BLOCKS.register("green_soul_candle_cake", () -> new SoulCandleCakeBlock(GREEN_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> RED_SOUL_CANDLE_CAKE = BLOCKS.register("red_soul_candle_cake", () -> new SoulCandleCakeBlock(RED_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));
    public static final RegistryObject<SoulCandleCakeBlock> BLACK_SOUL_CANDLE_CAKE = BLOCKS.register("black_soul_candle_cake", () -> new SoulCandleCakeBlock(BLACK_SOUL_CANDLE.get(), BlockBehaviour.Properties.copy(SOUL_CANDLE_CAKE.get())));

    public static final RegistryObject<SoulCarvedPumpkinBlock> SOUL_O_LANTERN = BLOCKS.register("soul_o_lantern", () -> new SoulCarvedPumpkinBlock(BlockBehaviour.Properties.of(Material.VEGETABLE, MaterialColor.COLOR_ORANGE).strength(1.0F).sound(SoundType.WOOD).lightLevel(state -> 11)));

    public static void register()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
