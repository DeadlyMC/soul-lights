package me.deadlymc.soullights.block;

import me.deadlymc.soullights.registry.SoulLightsParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CandleCakeBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class SoulCandleCakeBlock extends CandleCakeBlock
{
    public SoulCandleCakeBlock(Block candle, Settings settings)
    {
        super(candle, settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random)
    {
        if ((Boolean)state.get(LIT))
        {
            this.getParticleOffsets(state).forEach((offset) -> spawnSoulCandleParticles(world, offset.add((double)pos.getX(), (double)pos.getY(), (double)pos.getZ()), random));
        }
    }

    private static void spawnSoulCandleParticles(World world, Vec3d vec3d, Random random)
    {
        float f = random.nextFloat();
        if (f < 0.3F) {
            world.addParticle(ParticleTypes.SMOKE, vec3d.x, vec3d.y, vec3d.z, 0.0D, 0.0D, 0.0D);
            if (f < 0.17F) {
                world.playSound(vec3d.x + 0.5D, vec3d.y + 0.5D, vec3d.z + 0.5D, SoundEvents.BLOCK_CANDLE_AMBIENT, SoundCategory.BLOCKS, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
            }
        }
        world.addParticle(SoulLightsParticles.SMALL_SOUL_FLAME, vec3d.x, vec3d.y, vec3d.z, 0.0D, 0.0D, 0.0D);
    }
}
