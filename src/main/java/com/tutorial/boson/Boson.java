package com.tutorial.boson;

import com.tutorial.boson.configure.Config;
import com.tutorial.boson.container.ContainerTypeRegistry;
import com.tutorial.boson.entity_capabilityprovider.ItemRegistry;
import com.tutorial.boson.first_fluid.FluidRegistry;
import com.tutorial.boson.obsidian_animal.EntityTypeRegistry;
import com.tutorial.boson.particle.ParticleRegistry;
import com.tutorial.boson.sounds.SoundEventRegistry;
import com.tutorial.boson.special_render_type.BlockRegistry;
import com.tutorial.boson.tileentitydatasync.TileEntityTypeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Boson {
    public Boson() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        com.tutorial.boson.first_item.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.food.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.melee_weapons.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.tool.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.armor.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.first_block.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.first_block.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.blockstate.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.blockstate.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.notsoildblock.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.notsoildblock.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.special_render_type.ItemRegistry.ITEMS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.obj.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.obj.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.first_tileentity.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.first_tileentity.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.first_tileentity.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.tutorial.boson.tickabletileentity.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.tickabletileentity.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.tickabletileentity.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.tutorial.boson.tileentitydatasync.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.tileentitydatasync.BlockRegistry.BLOCKS.register(eventBus);
        TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.tutorial.boson.ibakedmodel.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.ibakedmodel.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.ter.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.ter.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.ter.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.tutorial.boson.ister.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.network.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.first_entity.EntityTypeRegistry.ENTITY_TYPES.register(eventBus);
        EntityTypeRegistry.ENTITY_TYPES.register(eventBus);
        com.tutorial.boson.first_cap.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.first_cap.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.first_cap.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.tutorial.boson.use_cap.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.use_cap.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.use_cap.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.wordsaveddata.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.wordsaveddata.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.first_gui.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.container.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.container.BlockRegistry.BLOCKS.register(eventBus);
        com.tutorial.boson.container.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        ContainerTypeRegistry.CONTAINERS.register(eventBus);
        com.tutorial.boson.hud.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.first_fluid.ItemRegistry.ITEMS.register(eventBus);
        com.tutorial.boson.first_fluid.BlockRegistry.BLOCKS.register(eventBus);
        FluidRegistry.FLUIDS.register(eventBus);
        com.tutorial.boson.configure.ItemRegistry.ITEMS.register(eventBus);
        ParticleRegistry.PARTICLE_TYPES.register(eventBus);
        com.tutorial.boson.sounds.ItemRegistry.ITEMS.register(eventBus);
        SoundEventRegistry.SOUNDS.register(eventBus);
    }
}
