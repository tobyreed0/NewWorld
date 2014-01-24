package blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockNewWorld extends Block{

	public BlockNewWorld(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(main.NewWorld.NewWorldCreativeTab);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon(reference.Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
