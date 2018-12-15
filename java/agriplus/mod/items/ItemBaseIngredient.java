package agriplus.mod.items;

import agriplus.mod.Main;
import agriplus.mod.init.ItemInit;
import agriplus.mod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBaseIngredient extends Item implements IHasModel
{
	public ItemBaseIngredient(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabagriplus);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
