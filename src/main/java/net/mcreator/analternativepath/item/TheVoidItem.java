
package net.mcreator.analternativepath.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.analternativepath.init.AnAlternativePathModTabs;

public class TheVoidItem extends RecordItem {
	public TheVoidItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("an_alternative_path:void")), new Item.Properties().tab(AnAlternativePathModTabs.TAB_AAPTAB).stacksTo(1).rarity(Rarity.RARE), 5080);
	}
}
