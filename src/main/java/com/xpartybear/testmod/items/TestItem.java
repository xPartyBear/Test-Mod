package com.xpartybear.testmod.items;

import com.xpartybear.testmod.TestMod;
import net.minecraft.item.Item;

public class TestItem extends Item {
    public TestItem(){
        super(new Item.Properties()
                .group(TestMod.setup.itemGroup));
        setRegistryName("testitem");
    }
}
