package me.deadlymc.soullights.block;

import me.deadlymc.soullights.registry.SoulLightsParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class SoulCandleCakeBlock extends CandleCakeBlock
{
    public SoulCandleCakeBlock(Block block, Properties properties)
    {
        super(block, properties);
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, Random random)
    {
        if ((Boolean)state.getValue(LIT))
        {
            this.getParticleOffsets(state).forEach((offset) -> spawnSoulCandleParticles(world, offset.add((double)pos.getX(), (double)pos.getY(), (double)pos.getZ()), random));
        }
    }

    private static void spawnSoulCandleParticles(Level world, Vec3 vec3d, Random random)
    {
        float f = random.nextFloat();
        if (f < 0.3F) {
            world.addParticle(ParticleTypes.SMOKE, vec3d.x, vec3d.y, vec3d.z, 0.0D, 0.0D, 0.0D);
            if (f < 0.17F) {
                world.playLocalSound(vec3d.x + 0.5D, vec3d.y + 0.5D, vec3d.z + 0.5D, SoundEvents.CANDLE_AMBIENT, SoundSource.BLOCKS, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
            }
        }
        world.addParticle(SoulLightsParticles.SMALL_SOUL_FLAME.get(), vec3d.x, vec3d.y, vec3d.z, 0.0D, 0.0D, 0.0D);
    }
}
