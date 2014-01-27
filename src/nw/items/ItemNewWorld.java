package nw.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemNewWorld extends Item{

	public ItemNewWorld(int id) {
		super(id);
		this.setCreativeTab(nw.main.NewWorld.NewWorldCreativeTab);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon(nw.main.Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
