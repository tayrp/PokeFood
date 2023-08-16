
package net.pokefood.item;

import net.pokefood.procedures.HuntingUnlockAdvProcedure;
import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.Entity;

public class DigNoseItem extends Item {
	public DigNoseItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_HUNT).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.5f)

				.meat().build()));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HuntingUnlockAdvProcedure.execute(entity, itemstack);
	}
}
