package com.earthturtle.firstly.items;

import com.earthturtle.firstly.Firstly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Firstly.TAB));
    }
}
