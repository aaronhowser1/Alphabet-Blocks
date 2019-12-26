package com.aaronhowser1.alphabetblocks;

import com.aaronhowser1.alphabetblocks.blocks.ModBlocks;
import com.aaronhowser1.alphabetblocks.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("alphabetblocks")
public class AlphabetBlocks {

    private static final Logger LOGGER = LogManager.getLogger();

    public AlphabetBlocks() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
//          Thank you Lat for giving me this code after seeing me flail hopelessly
            Block.Properties properties = Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement();
            for(char c = 'a'; c <= 'z'; c++) {
                event.getRegistry().register(new Block(properties).setRegistryName("big_" + c));
            }
//            TODO: Make lowercase letters
//            TODO: Make punctuation blocks
//            TODO: Make different versions: black on white, white on black, wooden toy, etc
//            TODO: Add memes
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(ModSetup.itemGroup);
//            Also this code
            for(char c = 'a'; c <= 'z'; c++) {
                event.getRegistry().register(new BlockItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("alphabetblocks", "big_" + c)), properties).setRegistryName("big_" + c));
            }
        }
    }
}