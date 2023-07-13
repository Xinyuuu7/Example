package Tools;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.rand.seed.WorldSeed;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import nl.jellejurre.seedchecker.SeedChecker;
import nl.jellejurre.seedchecker.SeedCheckerDimension;
import nl.jellejurre.seedchecker.TargetState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StructureLoot {
    public static int BastionLoot(long seed, ChunkRand rand, CPos bastionPos,String object) {
        int num = 0;
        long structureSeed = WorldSeed.toStructureSeed(seed);
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.NETHER);
        rand.setCarverSeed(structureSeed,bastionPos.getX(),bastionPos.getZ(), MCVersion.v1_16_1);
        int type = rand.nextInt(4);
        int rotation = rand.nextInt(4);
        if (Objects.equals(object, "heiyaoshi")) {
            int obsidian = 0;
            if (type == 0) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 10);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 50, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 10, 128, bastionPos.toBlockPos().getZ() - 20);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 50, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 20, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 10, 0, bastionPos.toBlockPos().getZ() + 20, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
            }
            if (type == 1) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 10);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 30, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 20, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 10, 0, bastionPos.toBlockPos().getZ() + 20, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 30);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
            }
            if (type == 2) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 10, 0, bastionPos.toBlockPos().getZ() + 40, bastionPos.toBlockPos().getX() + 40, 128, bastionPos.toBlockPos().getZ() - 40);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 40, 0, bastionPos.toBlockPos().getZ() + 40, bastionPos.toBlockPos().getX() + 40, 128, bastionPos.toBlockPos().getZ() - 10);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 40, 0, bastionPos.toBlockPos().getZ() + 40, bastionPos.toBlockPos().getX() + 10, 128, bastionPos.toBlockPos().getZ() - 40);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 40, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 40, 128, bastionPos.toBlockPos().getZ() - 40);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
            }
            if (type == 3) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 30, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 20);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 50, 0, bastionPos.toBlockPos().getZ() + 30, bastionPos.toBlockPos().getX() + 20, 128, bastionPos.toBlockPos().getZ() - 30);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 30, 0, bastionPos.toBlockPos().getZ() + 20, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 30, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 30);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.OBSIDIAN) {
                            obsidian += i.getCount();
                        }
                    }
                }
            }
            num = obsidian;
        }
        if (Objects.equals(object, "xian")) {
            int string = 0;
            if (type == 0) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 10);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 50, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 10, 128, bastionPos.toBlockPos().getZ() - 20);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 50, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 20, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 10, 0, bastionPos.toBlockPos().getZ() + 20, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
            }
            if (type == 1) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 10);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 30, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 20, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 10, 0, bastionPos.toBlockPos().getZ() + 20, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 30);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
            }
            if (type == 2) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 10, 0, bastionPos.toBlockPos().getZ() + 40, bastionPos.toBlockPos().getX() + 40, 128, bastionPos.toBlockPos().getZ() - 40);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 40, 0, bastionPos.toBlockPos().getZ() + 40, bastionPos.toBlockPos().getX() + 40, 128, bastionPos.toBlockPos().getZ() - 10);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 40, 0, bastionPos.toBlockPos().getZ() + 40, bastionPos.toBlockPos().getX() + 10, 128, bastionPos.toBlockPos().getZ() - 40);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 40, 0, bastionPos.toBlockPos().getZ() + 10, bastionPos.toBlockPos().getX() + 40, 128, bastionPos.toBlockPos().getZ() - 40);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
            }
            if (type == 3) {
                if (rotation == 0) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 30, 0, bastionPos.toBlockPos().getZ() + 50, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 20);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 1) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 50, 0, bastionPos.toBlockPos().getZ() + 30, bastionPos.toBlockPos().getX() + 20, 128, bastionPos.toBlockPos().getZ() - 30);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 2) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 30, 0, bastionPos.toBlockPos().getZ() + 20, bastionPos.toBlockPos().getX() + 30, 128, bastionPos.toBlockPos().getZ() - 50);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
                if (rotation == 3) {
                    Box box = new Box(bastionPos.toBlockPos().getX() - 20, 0, bastionPos.toBlockPos().getZ() + 30, bastionPos.toBlockPos().getX() + 50, 128, bastionPos.toBlockPos().getZ() - 30);
                    Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                    List<ItemStack> list = new ArrayList<>();
                    for (BlockPos pos : blockEntities.keySet()) {
                        list.addAll(checker.generateChestLoot(pos));
                    }
                    for (ItemStack i : list) {
                        if (i.getItem() == Items.STRING) {
                            string += i.getCount();
                        }
                    }
                }
            }
            num = string;
        }
        return num;
    }
    public static int BuriedTreasureLoot(long seed,CPos BuriedTreasurePos,String object) {
        int num = 0;
        SeedChecker checker = new SeedChecker(seed,TargetState.FULL,SeedCheckerDimension.OVERWORLD);
        if (Objects.equals(object, "tieding")) {
            int iron = 0;
            Box box = new Box(BuriedTreasurePos.toBlockPos().getX(),0,BuriedTreasurePos.toBlockPos().getZ(),BuriedTreasurePos.toBlockPos().getX()+10,64,BuriedTreasurePos.toBlockPos().getZ()+10);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.IRON_INGOT){
                    iron += i.getCount();
                }
            }
            num = iron;
        }
        if (Objects.equals(object, "tnt")) {
            int tnt = 0;
            Box box = new Box(BuriedTreasurePos.toBlockPos().getX(),0,BuriedTreasurePos.toBlockPos().getZ(),BuriedTreasurePos.toBlockPos().getX()+10,64,BuriedTreasurePos.toBlockPos().getZ()+10);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.TNT){
                    tnt += i.getCount();
                }
            }
            num = tnt;
        }
        return num;
    }

    public static int DesertPyramidLoot(long seed,CPos DesertPyramidPos,String object) {
        int num = 0;
        SeedChecker checker = new SeedChecker(seed,TargetState.FULL,SeedCheckerDimension.OVERWORLD);
        if (Objects.equals(object, "tieding")) {
            int iron = 0;
            Box box = new Box(DesertPyramidPos.toBlockPos().getX(),0,DesertPyramidPos.toBlockPos().getZ(),DesertPyramidPos.toBlockPos().getX()+16,64,DesertPyramidPos.toBlockPos().getZ()+16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.IRON_INGOT){
                    iron += i.getCount();
                }
            }
            num = iron;
        }
        if (Objects.equals(object, "jinpingguo")) {
            int goldenApple = 0;
            Box box = new Box(DesertPyramidPos.toBlockPos().getX(),0,DesertPyramidPos.toBlockPos().getZ(),DesertPyramidPos.toBlockPos().getX()+16,64,DesertPyramidPos.toBlockPos().getZ()+16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.GOLDEN_APPLE){
                    goldenApple += i.getCount();
                }
            }
            num = goldenApple;
        }
        if (Objects.equals(object, "huoyao")) {
            int gunpowder = 0;
            Box box = new Box(DesertPyramidPos.toBlockPos().getX(),0,DesertPyramidPos.toBlockPos().getZ(),DesertPyramidPos.toBlockPos().getX()+16,64,DesertPyramidPos.toBlockPos().getZ()+16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.GUNPOWDER){
                    gunpowder += i.getCount();
                }
            }
            num = gunpowder;
        }
        if (Objects.equals(object, "fumojinpingguo")) {
            int enchantedGoldenApple = 0;
            Box box = new Box(DesertPyramidPos.toBlockPos().getX(),0,DesertPyramidPos.toBlockPos().getZ(),DesertPyramidPos.toBlockPos().getX()+16,64,DesertPyramidPos.toBlockPos().getZ()+16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.ENCHANTED_GOLDEN_APPLE){
                    enchantedGoldenApple += i.getCount();
                }
            }
            num = enchantedGoldenApple;
        }
        return num;
    }

    public static int  JunglePyramidLoot(long seed,CPos JunglePyramidPos,String object) {
        int num = 0;
        SeedChecker checker = new SeedChecker(seed,TargetState.FULL,SeedCheckerDimension.OVERWORLD);
        if (Objects.equals(object, "tieding")) {
            int iron = 0;
            Box box = new Box(JunglePyramidPos.toBlockPos().getX(),0,JunglePyramidPos.toBlockPos().getZ(),JunglePyramidPos.toBlockPos().getX()+16,256,JunglePyramidPos.toBlockPos().getZ()+16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.IRON_INGOT){
                    iron += i.getCount();
                }
            }
            num = iron;
        }
        if (Objects.equals(object, "zuanshi")) {
            int diamond = 0;
            Box box = new Box(JunglePyramidPos.toBlockPos().getX(),0,JunglePyramidPos.toBlockPos().getZ(),JunglePyramidPos.toBlockPos().getX()+16,256,JunglePyramidPos.toBlockPos().getZ()+16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for(BlockPos pos : blockEntities.keySet()){
                list.addAll(checker.generateChestLoot(pos));
            }
            for(ItemStack i : list){
                if(i.getItem() == Items.DIAMOND){
                    diamond += i.getCount();
                }
            }
            num = diamond;
        }
        return num;
    }

    public static int  PillagerOutpost(long seed,ChunkRand rand,CPos PillagerOutpostPos,String object) {
        int num = 0;
        long structureSeed = WorldSeed.toStructureSeed(seed);
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.NETHER);
        rand.setCarverSeed(structureSeed,PillagerOutpostPos.getX(),PillagerOutpostPos.getZ(), MCVersion.v1_16_1);
        int rotation = rand.nextInt(4);
        if (Objects.equals(object, "tieding")) {
            int iron = 0;
            if (rotation == 0) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()+16,256,PillagerOutpostPos.toBlockPos().getZ()+16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
            if (rotation == 1) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()-16,256,PillagerOutpostPos.toBlockPos().getZ()+16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
            if (rotation == 2) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()-16,256,PillagerOutpostPos.toBlockPos().getZ()-16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
            if (rotation == 3) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()+16,256,PillagerOutpostPos.toBlockPos().getZ()-16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
        }
        if (Objects.equals(object, "xian")) {
            int string = 0;
            if (rotation == 0) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()+16,256,PillagerOutpostPos.toBlockPos().getZ()+16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.STRING){
                        string += i.getCount();
                    }
                }
                num = string;
            }
            if (rotation == 1) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()-16,256,PillagerOutpostPos.toBlockPos().getZ()+16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.STRING){
                        string += i.getCount();
                    }
                }
                num = string;
            }
            if (rotation == 2) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()-16,256,PillagerOutpostPos.toBlockPos().getZ()-16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.STRING){
                        string += i.getCount();
                    }
                }
                num = string;
            }
            if (rotation == 3) {
                Box box = new Box(PillagerOutpostPos.toBlockPos().getX(),0,PillagerOutpostPos.toBlockPos().getZ(),PillagerOutpostPos.toBlockPos().getX()+16,256,PillagerOutpostPos.toBlockPos().getZ()-16);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.STRING){
                        string += i.getCount();
                    }
                }
                num = string;
            }
        }
        return num;
    }

    public static int MansionLoot(long seed,ChunkRand rand,CPos MansionPos,String object) {
        int num = 0;
        long structureSeed = WorldSeed.toStructureSeed(seed);
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.NETHER);
        rand.setCarverSeed(structureSeed,MansionPos.getX(),MansionPos.getZ(), MCVersion.v1_16_1);
        int rotation = rand.nextInt(4);
        if (Objects.equals(object, "moyingzhenzhu")) {
            int enderPearl = 0;
            if (rotation == 0) {
                Box box = new Box(MansionPos.toBlockPos().getX()-50,0,MansionPos.toBlockPos().getZ()+50,MansionPos.toBlockPos().getX()+20,256,MansionPos.toBlockPos().getZ()-20);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.ENDER_PEARL){
                        enderPearl += i.getCount();
                    }
                }
                num = enderPearl;
            }
            if (rotation == 1) {
                Box box = new Box(MansionPos.toBlockPos().getX()-40,0,MansionPos.toBlockPos().getZ()+20,MansionPos.toBlockPos().getX()+30,256,MansionPos.toBlockPos().getZ()-60);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.ENDER_PEARL){
                        enderPearl += i.getCount();
                    }
                }
                num = enderPearl;
            }
            if (rotation == 2) {
                Box box = new Box(MansionPos.toBlockPos().getX(),0,MansionPos.toBlockPos().getZ()+30,MansionPos.toBlockPos().getX()+70,256,MansionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.ENDER_PEARL){
                        enderPearl += i.getCount();
                    }
                }
                num = enderPearl;
            }
            if (rotation == 3) {
                Box box = new Box(MansionPos.toBlockPos().getX() - 20, 0, MansionPos.toBlockPos().getZ() + 70, MansionPos.toBlockPos().getX() + 50, 256, MansionPos.toBlockPos().getZ());
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for (BlockPos pos : blockEntities.keySet()) {
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (ItemStack i : list) {
                    if (i.getItem() == Items.ENDER_PEARL) {
                        enderPearl += i.getCount();
                    }
                }
                num = enderPearl;
            }
        }
        if (Objects.equals(object, "xian")) {
            int string = 0;
            if (rotation == 0) {
                Box box = new Box(MansionPos.toBlockPos().getX()-50,0,MansionPos.toBlockPos().getZ()+50,MansionPos.toBlockPos().getX()+20,256,MansionPos.toBlockPos().getZ()-20);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.STRING){
                        string += i.getCount();
                    }
                }
                num = string;
            }
            if (rotation == 1) {
                Box box = new Box(MansionPos.toBlockPos().getX()-40,0,MansionPos.toBlockPos().getZ()+20,MansionPos.toBlockPos().getX()+30,256,MansionPos.toBlockPos().getZ()-60);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.STRING){
                        string += i.getCount();
                    }
                }
                num = string;
            }
            if (rotation == 2) {
                Box box = new Box(MansionPos.toBlockPos().getX(),0,MansionPos.toBlockPos().getZ()+30,MansionPos.toBlockPos().getX()+70,256,MansionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.STRING){
                        string += i.getCount();
                    }
                }
                num = string;
            }
            if (rotation == 3) {
                Box box = new Box(MansionPos.toBlockPos().getX() - 20, 0, MansionPos.toBlockPos().getZ() + 70, MansionPos.toBlockPos().getX() + 50, 256, MansionPos.toBlockPos().getZ());
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for (BlockPos pos : blockEntities.keySet()) {
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (ItemStack i : list) {
                    if (i.getItem() == Items.STRING) {
                        string += i.getCount();
                    }
                }
                num = string;
            }
        }
        return num;
    }

    public static int ShipwreckLoot(long seed,ChunkRand rand,CPos ShipwreckPos,String object) {
        int num = 0;
        long structureSeed = WorldSeed.toStructureSeed(seed);
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.NETHER);
        rand.setCarverSeed(structureSeed,ShipwreckPos.getX(),ShipwreckPos.getZ(), MCVersion.v1_16_1);
        int rotation = rand.nextInt(4);
        if (Objects.equals(object, "tieding")) {
            int iron = 0;
            if (rotation == 0) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX(),0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()+16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
            if (rotation == 1) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX()+16,0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()-16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
            if (rotation == 2) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX(),0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()+16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
            if (rotation == 3) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX()+16,0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()-16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.IRON_INGOT){
                        iron += i.getCount();
                    }
                }
                num = iron;
            }
        }
        if (Objects.equals(object, "zuanshi")) {
            int diamond = 0;
            if (rotation == 0) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX(),0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()+16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.DIAMOND){
                        diamond += i.getCount();
                    }
                }
                num = diamond;
            }
            if (rotation == 1) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX()+16,0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()-16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.DIAMOND){
                        diamond += i.getCount();
                    }
                }
                num = diamond;
            }
            if (rotation == 2) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX(),0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()+16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.DIAMOND){
                        diamond += i.getCount();
                    }
                }
                num = diamond;
            }
            if (rotation == 3) {
                Box box = new Box(ShipwreckPos.toBlockPos().getX()+16,0,ShipwreckPos.toBlockPos().getZ(),ShipwreckPos.toBlockPos().getX()-16,256,ShipwreckPos.toBlockPos().getZ()+32);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for(ItemStack i : list){
                    if(i.getItem() == Items.DIAMOND){
                        diamond += i.getCount();
                    }
                }
                num = diamond;
            }
        }
        return num;
    }

    public static int RuinedPortalLoot(long seed,CPos RuinedPortalPos,String object) {
        int num = 0;
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
        if (Objects.equals(object, "heiyaoshi")) {
            int obsidian = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.OBSIDIAN) {
                    obsidian += i.getCount();
                }
            }
            num = obsidian;
        }
        if (Objects.equals(object, "dahuoshi")) {
            int flintAndSteel = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.FLINT_AND_STEEL) {
                    flintAndSteel += i.getCount();
                }
            }
            num = flintAndSteel;
        }
        if (Objects.equals(object, "tieli")) {
            int ironNugget = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.IRON_NUGGET) {
                    ironNugget += i.getCount();
                }
            }
            num = ironNugget;
        }
        if (Objects.equals(object, "huoyandan")) {
            int fireCharge = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.FIRE_CHARGE) {
                    fireCharge += i.getCount();
                }
            }
            num = fireCharge;
        }
        if (Objects.equals(object, "suishi")) {
            int flint = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.FLINT) {
                    flint += i.getCount();
                }
            }
            num = flint;
        }
        if (Objects.equals(object, "jingao")) {
            int goldenPickaxe = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLDEN_PICKAXE) {
                    goldenPickaxe += i.getCount();
                }
            }
            num = goldenPickaxe;
        }
        if (Objects.equals(object, "jinchan")) {
            int goldenShovel = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLDEN_SHOVEL) {
                    goldenShovel += i.getCount();
                }
            }
            num = goldenShovel;
        }
        if (Objects.equals(object, "jinfu")) {
            int goldenAxe = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLDEN_AXE) {
                    goldenAxe += i.getCount();
                }
            }
            num = goldenAxe;
        }
        if (Objects.equals(object, "jinpingguo")) {
            int goldenApple = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLDEN_APPLE) {
                    goldenApple += i.getCount();
                }
            }
            num = goldenApple;
        }
        if (Objects.equals(object, "jinchu")) {
            int goldenHoe = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLDEN_HOE) {
                    goldenHoe += i.getCount();
                }
            }
            num = goldenHoe;
        }
        if (Objects.equals(object, "jinli")) {
            int goldNugget = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLD_NUGGET) {
                    goldNugget += i.getCount();
                }
            }
            num = goldNugget;
        }
        if (Objects.equals(object, "jinjian")) {
            int goldenSword = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLDEN_SWORD) {
                    goldenSword += i.getCount();
                }
            }
            num = goldenSword;
        }
        if (Objects.equals(object, "jinding")) {
            int goldIngot = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLD_INGOT) {
                    goldIngot += i.getCount();
                }
            }
            num = goldIngot;
        }
        if (Objects.equals(object, "jinhuluobo")) {
            int goldenCarrot = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLDEN_CARROT) {
                    goldenCarrot += i.getCount();
                }
            }
            num = goldenCarrot;
        }
        if (Objects.equals(object, "fumojinpingguo")) {
            int enchantedGoldenApple = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
                    enchantedGoldenApple += i.getCount();
                }
            }
            num = enchantedGoldenApple;
        }
        if (Objects.equals(object, "jinkuai")) {
            int goldenBlock = 0;
            Box box = new Box(RuinedPortalPos.toBlockPos().getX(), 0, RuinedPortalPos.toBlockPos().getZ(), RuinedPortalPos.toBlockPos().getX() + 16, 128, RuinedPortalPos.toBlockPos().getZ() + 16);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (ItemStack i : list) {
                if (i.getItem() == Items.GOLD_BLOCK) {
                    goldenBlock += i.getCount();
                }
            }
            num = goldenBlock;
        }
        return num;
    }
}
