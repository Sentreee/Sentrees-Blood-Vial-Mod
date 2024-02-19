package net.sentree.sentreesmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.sentree.sentreesmod.SentreesBloodVialMod;
import net.sentree.sentreesmod.item.ModItems;
import net.sentree.sentreesmod.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, SentreesBloodVialMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("blood_vial_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.BLOOD_VIAL.get()));

        add("blood_vial_from_wolf", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wolf")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build()}, ModItems.BLOOD_VIAL.get()));


    }
}
