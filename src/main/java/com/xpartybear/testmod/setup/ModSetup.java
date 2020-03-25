package com.xpartybear.testmod.setup;

import com.xpartybear.testmod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public void init(){

    }
    public ItemGroup itemGroup = new ItemGroup("testmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.TESTBLOCK);
        }
    };
}
