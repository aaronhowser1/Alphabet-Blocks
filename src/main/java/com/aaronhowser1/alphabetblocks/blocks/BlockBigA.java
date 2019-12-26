package com.aaronhowser1.alphabetblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBigA extends Block {
    public BlockBigA() {
        super(Properties.create(Material.WOOD)
        .sound(SoundType.WOOD)
        .doesNotBlockMovement()
        );
        setRegistryName("big_a");
    }
}
