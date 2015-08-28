package crazyores.manager.world.generate;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenNearWater extends WorldGenerator
{
    private Block block;
    /** The number of blocks to generate. */
    private int numberOfBlocks;

    public WorldGenNearWater(Block blockToSpawn, int veinSize) {
        this.block = blockToSpawn;
        this.numberOfBlocks = veinSize;
    }

    @Override
    public boolean generate(World world, Random rand, int x, int y, int z)
    {
        if (world.getBlock(x, y, z).getMaterial() != Material.water) {
            return false;
        }
        else {
            int l = rand.nextInt(this.numberOfBlocks) + 2;
            byte b0 = 1;

            for (int i1 = x; i1 <= x + l; ++i1)
            {
                for (int j1 = z; j1 <= z + l; ++j1)
                {
                    int k1 = i1 - x;
                    int l1 = j1 - z;

                    if (k1 * k1 + l1 * l1 <= l * l)
                    {
                        for (int i2 = y - b0; i2 <= y + b0; ++i2)
                        {
                            Block block = world.getBlock(i1, i2, j1);

                            if (block == Blocks.dirt || block == Blocks.gravel) {
                                world.setBlock(i1, i2, j1, this.block, 0, 2);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }
}