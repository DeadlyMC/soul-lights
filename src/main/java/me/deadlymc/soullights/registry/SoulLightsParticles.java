package me.deadlymc.soullights.registry;

import me.deadlymc.soullights.SoulLights;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoulLightsParticles
{
    public static final DefaultParticleType SMALL_SOUL_FLAME = FabricParticleTypes.simple();

    public static void register()
    {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(SoulLights.MODID, "small_soul_flame"), SMALL_SOUL_FLAME);
        ParticleFactoryRegistry.getInstance().register(SMALL_SOUL_FLAME, FlameParticle.SmallFactory::new);
    }
}
