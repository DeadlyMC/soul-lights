package me.deadlymc.soullights;

import me.deadlymc.soullights.registry.SoulLightsBlocks;
import me.deadlymc.soullights.registry.SoulLightsItems;
import me.deadlymc.soullights.registry.SoulLightsParticles;
import net.fabricmc.api.ModInitializer;

public class SoulLights implements ModInitializer
{
    public static final String MODID = "soullights";

    @Override
    public void onInitialize()
    {
        SoulLightsBlocks.register();
        SoulLightsItems.register();
        SoulLightsParticles.register();
    }
}
