
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.analternativepath.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.analternativepath.AnAlternativePathMod;

public class AnAlternativePathModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AnAlternativePathMod.MODID);
	public static final RegistryObject<SoundEvent> VOID = REGISTRY.register("void", () -> new SoundEvent(new ResourceLocation("an_alternative_path", "void")));
	public static final RegistryObject<SoundEvent> DEATH = REGISTRY.register("death", () -> new SoundEvent(new ResourceLocation("an_alternative_path", "death")));
}
