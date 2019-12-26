package com.aaronhowser1.alphabetblocks;

import com.aaronhowser1.alphabetblocks.blocks.ModBlocks;
import com.aaronhowser1.alphabetblocks.setup.ClientProxy;
import com.aaronhowser1.alphabetblocks.setup.IProxy;
import com.aaronhowser1.alphabetblocks.setup.ModSetup;
import com.aaronhowser1.alphabetblocks.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("alphabetblocks")
public class AlphabetBlocks {

    private static final Logger LOGGER = LogManager.getLogger();

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

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
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_a"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_b"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_c"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_d"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_e"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_f"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_g"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_h"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_i"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_j"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_k"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_l"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_m"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_n"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_o"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_p"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_q"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_r"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_s"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_t"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_u"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_v"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_w"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_x"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_y"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("big_z"));
            event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement()).setRegistryName("small_a"));
//            TODO: Make lowercase letters
//            TODO: Make punctuation blocks
//            TODO: Make different versions: black on white, white on black, wooden toy, etc
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(ModSetup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGA, properties).setRegistryName("big_a"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGB, properties).setRegistryName("big_b"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGC, properties).setRegistryName("big_c"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGD, properties).setRegistryName("big_d"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGE, properties).setRegistryName("big_e"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGF, properties).setRegistryName("big_f"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGG, properties).setRegistryName("big_g"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGH, properties).setRegistryName("big_h"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGI, properties).setRegistryName("big_i"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGJ, properties).setRegistryName("big_j"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGK, properties).setRegistryName("big_k"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGL, properties).setRegistryName("big_l"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGM, properties).setRegistryName("big_m"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGN, properties).setRegistryName("big_n"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGO, properties).setRegistryName("big_o"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGP, properties).setRegistryName("big_p"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGQ, properties).setRegistryName("big_q"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGR, properties).setRegistryName("big_r"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGS, properties).setRegistryName("big_s"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGT, properties).setRegistryName("big_t"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGU, properties).setRegistryName("big_u"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGV, properties).setRegistryName("big_v"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGW, properties).setRegistryName("big_w"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGX, properties).setRegistryName("big_x"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGY, properties).setRegistryName("big_y"));
            event.getRegistry().register(new BlockItem(ModBlocks.BLOCKBIGZ, properties).setRegistryName("big_z"));
        }
    }
}