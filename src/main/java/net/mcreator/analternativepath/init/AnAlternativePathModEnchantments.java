
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.analternativepath.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.analternativepath.enchantment.FairyHunterEnchantment;
import net.mcreator.analternativepath.AnAlternativePathMod;

public class AnAlternativePathModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AnAlternativePathMod.MODID);
	public static final RegistryObject<Enchantment> FAIRY_HUNTER = REGISTRY.register("fairy_hunter", () -> new FairyHunterEnchantment());
}
