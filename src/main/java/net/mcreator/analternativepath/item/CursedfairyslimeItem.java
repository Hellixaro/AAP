
package net.mcreator.analternativepath.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.analternativepath.init.AnAlternativePathModTabs;

public class CursedfairyslimeItem extends Item {
	public CursedfairyslimeItem() {
		super(new Item.Properties().tab(AnAlternativePathModTabs.TAB_AAPTAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
