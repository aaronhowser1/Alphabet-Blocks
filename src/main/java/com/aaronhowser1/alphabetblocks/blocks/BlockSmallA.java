package com.aaronhowser1.alphabetblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSmallA extends Block {
    public BlockSmallA() {
        super(Properties.create(Material.WOOD)
                .sound(SoundType.WOOD)
                .doesNotBlockMovement()
        );
        setRegistryName("small_a");
    }
}
