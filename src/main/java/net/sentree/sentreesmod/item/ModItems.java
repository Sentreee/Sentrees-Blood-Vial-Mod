package net.sentree.sentreesmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sentree.sentreesmod.SentreesFoodsMod;
import net.sentree.sentreesmod.item.custom.ModFoods;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SentreesFoodsMod.MOD_ID);

    public static final RegistryObject<Item> BLOOD_VIAL = ITEMS.register("blood_vial",
            () -> new Item(new Item.Properties().food(ModFoods.BLOOD_VIAL)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}