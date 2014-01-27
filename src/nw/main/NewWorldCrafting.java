package nw.main;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class NewWorldCrafting {

	public static void registerShaped(){
//		GameRegistry.addRecipe(new ItemStack(), new Object[]{
//			"XXX",
//			"XYX",
//			"XXX",
//			'X', Item., 'Y', block.
//		});
	}
	public static void registerShapeless(){
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.silk), new Object[]{
			new ItemStack(Block.cloth)
		});
		
	}
	public static void registerSmelting(){
		FurnaceRecipes.smelting().addSmelting(Item.leather.itemID, 0, new ItemStack(NewWorld.parchment), 0.1F);
	}
}
