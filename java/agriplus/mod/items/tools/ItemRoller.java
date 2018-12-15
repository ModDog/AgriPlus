package agriplus.mod.items.tools;

import agriplus.mod.Main;
import agriplus.mod.init.ItemInit;
import agriplus.mod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRoller extends Item implements IHasModel 
{
	public ItemRoller(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabagriplus);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
