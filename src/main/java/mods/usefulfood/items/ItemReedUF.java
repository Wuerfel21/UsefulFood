package mods.usefulfood.items;


import net.minecraft.block.Block;
import net.minecraft.item.ItemReed;
import mods.usefulfood.mod_usefulfood;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemReedUF extends ItemReed 
{

	String name;
	
	public ItemReedUF(Block var2, String name) {
		super(var2);
		this.setMaxStackSize(1);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		this.setTextureName("usefulfood:" + name);
		GameRegistry.registerItem(this, name, "UsefulFood");
	}
}
