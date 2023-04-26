
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.analternativepath.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.analternativepath.item.TheVoidItem;
import net.mcreator.analternativepath.item.TheDeathItem;
import net.mcreator.analternativepath.item.FairyslimeItem;
import net.mcreator.analternativepath.item.CursedfairyslimeItem;
import net.mcreator.analternativepath.AnAlternativePathMod;

public class AnAlternativePathModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnAlternativePathMod.MODID);
	public static final RegistryObject<Item> THE_DEATH = REGISTRY.register("the_death", () -> new TheDeathItem());
	public static final RegistryObject<Item> THE_VOID = REGISTRY.register("the_void", () -> new TheVoidItem());
	public static final RegistryObject<Item> FAIRYSLIME = REGISTRY.register("fairyslime", () -> new FairyslimeItem());
	public static final RegistryObject<Item> CURSEDFAIRYSLIME = REGISTRY.register("cursedfairyslime", () -> new CursedfairyslimeItem());
}
