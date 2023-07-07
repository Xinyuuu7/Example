package XinyuQi;

import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.rand.seed.WorldSeed;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.loot.item.Items;
import com.seedfinding.mcfeature.misc.SpawnPoint;
import com.seedfinding.mcfeature.structure.Village;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import profotoce59.properties.VillageGenerator;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        long seed_start = -9223372036854775808L;
        long seed_end = 9223372036853775807L;
        ChunkRand rand = new ChunkRand();
        for (long seed = seed_start;seed <= seed_end;seed++) {
            village(seed,rand);
        }
    }

    public static void spawn(long seed) {
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVersion.v1_16_1,seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        SpawnPoint sp = new SpawnPoint();
        BPos spawn = sp.getSpawnPoint(otg);
        System.out.println(seed + " " + spawn);
    }

    public static void village(long seed,ChunkRand rand) {
        long structureSeed = WorldSeed.toStructureSeed(seed);
        Village village = new Village(MCVersion.v1_16_1);
        CPos pos = village.getInRegion(structureSeed,0,0,rand);
        if (pos == null) {
            return;
        }
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVersion.v1_16_1,seed);
        if (!village.canSpawn(pos,obs)) {
            return;
        }
        VillageGenerator villageGenerator = new VillageGenerator(MCVersion.v1_16_1);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        villageGenerator.generate(otg,pos);
        List<Pair<BPos, List<ItemStack>>> chests = villageGenerator.generateLoot(otg,rand);
        int obsidian = 0;
        for (Pair<BPos, List<ItemStack>> chest : chests) {
            for (ItemStack item : chest.getSecond()) {
                if (item.getItem().equals(Items.OBSIDIAN)) {
                    obsidian += item.getCount();
                }
            }
        }
        if (obsidian < 10) {
            return;
        }
        System.out.println(seed);
        System.out.println(pos.toBlockPos());
        System.out.println("obsidian" + " " + obsidian);
    }
}