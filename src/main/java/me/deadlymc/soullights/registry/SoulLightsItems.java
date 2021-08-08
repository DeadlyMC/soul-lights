package me.deadlymc.soullights.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static me.deadlymc.soullights.SoulLights.MODID;

public class SoulLightsItems
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> SOUL_CANDLE = ITEMS.register("soul_candle", () -> new BlockItem(SoulLightsBlocks.SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> WHITE_SOUL_CANDLE = ITEMS.register("white_soul_candle", () -> new BlockItem(SoulLightsBlocks.WHITE_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ORANGE_SOUL_CANDLE = ITEMS.register("orange_soul_candle", () -> new BlockItem(SoulLightsBlocks.ORANGE_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MAGENTA_SOUL_CANDLE = ITEMS.register("magenta_soul_candle", () -> new BlockItem(SoulLightsBlocks.MAGENTA_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_BLUE_SOUL_CANDLE = ITEMS.register("light_blue_soul_candle", () -> new BlockItem(SoulLightsBlocks.LIGHT_BLUE_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> YELLOW_SOUL_CANDLE = ITEMS.register("yellow_soul_candle", () -> new BlockItem(SoulLightsBlocks.YELLOW_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIME_SOUL_CANDLE = ITEMS.register("lime_soul_candle", () -> new BlockItem(SoulLightsBlocks.LIME_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PINK_SOUL_CANDLE = ITEMS.register("pink_soul_candle", () -> new BlockItem(SoulLightsBlocks.PINK_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GRAY_SOUL_CANDLE = ITEMS.register("gray_soul_candle", () -> new BlockItem(SoulLightsBlocks.GRAY_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_GRAY_SOUL_CANDLE = ITEMS.register("light_gray_soul_candle", () -> new BlockItem(SoulLightsBlocks.LIGHT_GRAY_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CYAN_SOUL_CANDLE = ITEMS.register("cyan_soul_candle", () -> new BlockItem(SoulLightsBlocks.CYAN_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PURPLE_SOUL_CANDLE = ITEMS.register("purple_soul_candle", () -> new BlockItem(SoulLightsBlocks.PURPLE_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLUE_SOUL_CANDLE = ITEMS.register("blue_soul_candle", () -> new BlockItem(SoulLightsBlocks.BLUE_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BROWN_SOUL_CANDLE = ITEMS.register("brown_soul_candle", () -> new BlockItem(SoulLightsBlocks.BROWN_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GREEN_SOUL_CANDLE = ITEMS.register("green_soul_candle", () -> new BlockItem(SoulLightsBlocks.GREEN_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> RED_SOUL_CANDLE = ITEMS.register("red_soul_candle", () -> new BlockItem(SoulLightsBlocks.RED_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLACK_SOUL_CANDLE = ITEMS.register("black_soul_candle", () -> new BlockItem(SoulLightsBlocks.BLACK_SOUL_CANDLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> SOUL_O_LANTERN = ITEMS.register("soul_o_lantern", () -> new BlockItem(SoulLightsBlocks.SOUL_O_LANTERN.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static void register()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
