
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookiePidgeottoItem extends Item {
	public CookiePidgeottoItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_COOKIES).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f).alwaysEat()

						.build()));
	}
}
