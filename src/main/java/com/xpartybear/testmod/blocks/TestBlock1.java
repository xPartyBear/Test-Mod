package com.xpartybear.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TestBlock1 extends Block {
    public TestBlock1(){
        super(Properties.create(Material.ROCK)
        .sound(SoundType.STONE)
        .hardnessAndResistance(3.0F)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(3));
        setRegistryName("testblock");
    }
}

