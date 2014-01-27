package items;

import cpw.mods.fml.relauncher.Side;
import main.NewWorld;
import cpw.mods.fml.relauncher.SideOnly;
import main.NewWorldCreativeTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemNewWorld extends Item{

	public ItemNewWorld(int id) {
		super(id);
		this.setCreativeTab(main.NewWorld.NewWorldCreativeTab);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon(reference.Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
