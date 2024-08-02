package tutorial;

import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.misc.SpawnPoint;
import com.seedfinding.mcfeature.structure.Village;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import profotoce59.properties.VillageGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SSG {
    static Village village = new Village(MCVersion.v1_16_1);
    static VillageGenerator generator = new VillageGenerator(MCVersion.v1_16_1);
    static SpawnPoint spawnPoint = new SpawnPoint();

    public static void main(String[] args) throws IOException {
        String path = "./Some 12 eyes seed_1_16_1.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        int startLine = 10;
        int endLine = 50;
        int count = 0;
        int seeds = 0;
        String line;
        ChunkRand rand = new ChunkRand();
        while ((line = reader.readLine()) != null) {
            if (count >= startLine && count <= endLine) {
                String[] parts = line.split(" ");
                long seed = Long.parseLong(parts[0]);
                CPos strongholdPos = new CPos(Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));
                if (checkSeed(seed, strongholdPos, rand)) {
                    System.out.println(seed);
                    seeds++;
                }
            }
            count++;
            if (count % 5000 == 0 & count > startLine) {
                int num = count-startLine;
                System.out.println("Check " + num + " seeds");
                System.out.println("Find " + seeds + " seeds");
            }
            if (count == endLine) {
                System.out.println("Please reset the range");
                return;
            }
        }
    }

    public static boolean checkSeed(long seed, CPos strongholdPos, ChunkRand rand) {
        CPos villagePos = village.getInRegion(seed, 0, 0, rand);
        if (villagePos == null) {
            return false;
        }
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVersion.v1_16_1, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        if (!generator.generate(otg, villagePos)) {
            return false;
        }
        int obsidian = 0;
        for (Pair<BPos, List<ItemStack>> chest : generator.generateLoot(otg, rand)) {
            for (ItemStack itemStack : chest.getSecond()) {
                if (itemStack.getItem().equalsName("obsidian")) {
                    obsidian += itemStack.getCount();
                    break;
                }
            }
        }
        if (obsidian < 20) {
            return false;
        }
        BPos spawn = spawnPoint.getSpawnPoint(otg);
        double toVillage = spawn.distanceTo(villagePos.toBlockPos(spawn.getY()), DistanceMetric.EUCLIDEAN);
        double toStronghold = spawn.distanceTo(strongholdPos.toBlockPos(spawn.getY()), DistanceMetric.EUCLIDEAN);
        return toVillage <= 96 && toStronghold <= 1800;
    }
}