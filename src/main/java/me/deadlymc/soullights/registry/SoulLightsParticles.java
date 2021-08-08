package me.deadlymc.soullights.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static me.deadlymc.soullights.SoulLights.MODID;

public class SoulLightsParticles
{
    private static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MODID);
    public static final RegistryObject<SimpleParticleType> SMALL_SOUL_FLAME = PARTICLE_TYPES.register("small_soul_flame", () -> new SimpleParticleType(false));

    @Mod.EventBusSubscriber(modid = MODID, bus = Bus.MOD)
    private static class ParticleRegistryEvent
    {
        @SubscribeEvent
        public static void register(ParticleFactoryRegisterEvent event)
        {
            Minecraft.getInstance().particleEngine.register(SMALL_SOUL_FLAME.get(), FlameParticle.SmallFlameProvider::new);
        }
    }

    public static void register()
    {
        PARTICLE_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
