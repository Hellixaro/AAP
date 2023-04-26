
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.analternativepath.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AnAlternativePathModTabs {
	public static CreativeModeTab TAB_AAPTAB;

	public static void load() {
		TAB_AAPTAB = new CreativeModeTab("tabaaptab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnAlternativePathModItems.CURSEDFAIRYSLIME.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
