package XinyuQi;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.rand.seed.WorldSeed;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.loot.item.Items;
import com.seedfinding.mcfeature.misc.SpawnPoint;
import com.seedfinding.mcfeature.structure.BuriedTreasure;
import com.seedfinding.mcfeature.structure.Village;
import com.seedfinding.mcseed.rand.JRand;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import profotoce59.properties.VillageGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Test {
    static Village village1171 = new Village(MCVersion.v1_17_1);
    static VillageGenerator generator = new VillageGenerator(MCVersion.v1_17_1);
    static SpawnPoint spawnPoint = new SpawnPoint();
    public static void main(String[] args) throws IOException {
        /*long seed_start = -9223372036854775808L;
        long seed_end = 9223372036853775807L;
        ChunkRand rand = new ChunkRand();
        for (long seed = seed_start;seed <= seed_end;seed++) {
            biome(seed);
        }*/
        String fileName1 = "./12eye1171Unique.txt";
        String fileName2 = "./20obsidian.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        ChunkRand rand = new ChunkRand();
        while(reader.ready()) {
            String[] line = reader.readLine().split(Pattern.quote(" "));
            long seed = Long.parseLong(line[0]);
            CPos strongholdPos = new CPos(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
            With20obsidianVillageAnd12eyesSeedsIn1171(seed,strongholdPos,rand,writer);
        }
        writer.close();
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

    public static void treasure(long seed,ChunkRand rand) {
        long structureSeed = WorldSeed.toStructureSeed(seed);
        BuriedTreasure buriedTreasure = new BuriedTreasure(MCVersion.v1_16_1);
        CPos treasurePos = null;
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVersion.v1_16_1,seed);
        for (int x = -16 ; x < 17 ; x++) {
            for (int z = -16 ; z < 17 ; z++) {
                CPos pos = buriedTreasure.getInRegion(structureSeed,x,z,rand);
                if (pos != null) {
                    if (buriedTreasure.canSpawn(pos,obs)) {
                        treasurePos = pos;
                    }
                }
            }
        }
        if (treasurePos == null) {
            return;
        }
        ChestContent chest = buriedTreasure.getLootAtPos(seed,treasurePos,rand,false).get(0);
        int iron = 0;
        for (ItemStack item : chest.getItems()) {
            if (item.getItem().equals(Items.IRON_INGOT)) {
                iron = item.getCount();
            }
        }
        if (iron < 7) {
            return;
        }
        BPos chestPos = new BPos(treasurePos.toBlockPos().getX()+9,0,treasurePos.toBlockPos().getZ()+9);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        SpawnPoint sp = new SpawnPoint();
        BPos spawn = sp.getSpawnPoint(otg);
        if (spawn.distanceTo(chestPos, DistanceMetric.EUCLIDEAN) > 50) {
            return;
        }
        System.out.println(seed);
        System.out.println(chestPos);
        System.out.println(iron + " iron");
    }
    public static void biome(long seed) {
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVersion.v1_16_1,seed);
        List<Biome> biomes = Arrays.asList(Biomes.RIVER, Biomes.DEEP_OCEAN,Biomes.BEACH);
        JRand rand = new JRand(seed);
        BPos pos = obs.locateBiome(0,0,0,16,biomes,rand);
        if (pos == null) {
            return;
        }
        System.out.println(seed);
        System.out.println(pos);
    }

    public static void With20obsidianVillageAnd12eyesSeedsIn1171(long seed,CPos strongholdPos,ChunkRand rand,BufferedWriter writer) throws IOException {
        long structureSeed = WorldSeed.toStructureSeed(seed);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVersion.v1_17_1,seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        List<CPos> villagePos = new ArrayList<>();
        CPos village1 = village1171.getInRegion(structureSeed,0,0,rand);
        if (checkVillage(rand,village1,obs,otg)) {
            villagePos.add(village1);
        }
        CPos village2 = village1171.getInRegion(structureSeed,-1,0,rand);
        if (checkVillage(rand,village2,obs,otg)) {
            villagePos.add(village2);
        }
        CPos village3 = village1171.getInRegion(structureSeed,-1,-1,rand);
        if (checkVillage(rand,village3,obs,otg)) {
            villagePos.add(village3);
        }
        CPos village4 = village1171.getInRegion(structureSeed,0,-1,rand);
        if (checkVillage(rand,village4,obs,otg)) {
            villagePos.add(village4);
        }
        if (villagePos.size() == 0) {
            return;
        }
        System.out.println(seed);
        System.out.println("found 20obsidian village");
        System.out.println(villagePos);
        BPos spawn = spawnPoint.getSpawnPoint(otg);
        for (CPos village : villagePos) {
            if (spawn.distanceTo(village.toBlockPos(),DistanceMetric.EUCLIDEAN) < 128) {
                writer.write(seed + " " + village.toBlockPos().getX() + " " + village.toBlockPos().getZ()
                        + " " + strongholdPos.toBlockPos().getX() + " " + strongholdPos.toBlockPos().getZ());
            }
            System.out.println("Seed Found!!!");
        }
    }

    public static boolean checkVillage(ChunkRand rand,CPos villagePos,OverworldBiomeSource obs,OverworldTerrainGenerator otg) {
        if (villagePos == null) {
            return false;
        }
        if (!village1171.canSpawn(villagePos,obs)) {
            return false;
        }
        generator.generate(otg,villagePos);
        List<Pair<BPos, List<ItemStack>>> chests = generator.generateLoot(otg,rand);
        int obsidian = 0;
        for (Pair<BPos, List<ItemStack>> chest : chests) {
            for (ItemStack item : chest.getSecond()) {
                if (item.getItem().equals(Items.OBSIDIAN)) {
                    obsidian += item.getCount();
                }
            }
        }
        return obsidian >= 20;
    }
}
