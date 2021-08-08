package me.deadlymc.soullights;

import me.deadlymc.soullights.registry.SoulLightsBlocks;
import me.deadlymc.soullights.registry.SoulLightsItems;
import me.deadlymc.soullights.registry.SoulLightsParticles;
import net.minecraftforge.fml.common.Mod;

@Mod(SoulLights.MODID)
public class SoulLights
{
    public static final String MODID = "soullights";

    public SoulLights()
    {
        SoulLightsBlocks.register();
        SoulLightsItems.register();
        SoulLightsParticles.register();
    }
}
