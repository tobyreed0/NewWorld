package nw.main;

import nw.items.ItemParchment;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

// for futrue changes of annotation @mod use the reference class
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class NewWorld {
	
	//Items
	public static Item parchment;
	//Blocks
	
	//Entities
	
	//Other
	public static NewWorldCreativeTab  NewWorldCreativeTab = new NewWorldCreativeTab(CreativeTabs.getNextID(), Reference.MOD_NAME);
	
	@EventHandler
	public void load(FMLInitializationEvent Event){
		
		//Items
		parchment = new ItemParchment(5550).setUnlocalizedName("itemParchment");
		
		//Blocks
		
		//Entities
		
		//Other
		NewWorldCrafting.registerShaped();
		NewWorldCrafting.registerShapeless();
		NewWorldCrafting.registerSmelting();
		
	}
}
