package com.gihtub.fledgexu.boson.hud;

import com.gihtub.fledgexu.boson.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianHud = ITEMS.register("obsidian_hud", ObsidianHudItem::new);
}
