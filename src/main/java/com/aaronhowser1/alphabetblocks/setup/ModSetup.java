package com.aaronhowser1.alphabetblocks.setup;

import com.aaronhowser1.alphabetblocks.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public static ItemGroup itemGroup = new ItemGroup("alphabetblocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.BLOCKBIGA);
        }
    };
}
