package agriplus.mod.items.tools;

import agriplus.mod.Main;
import agriplus.mod.init.ItemInit;
import agriplus.mod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMortarPestle extends Item implements IHasModel
{
	public ItemMortarPestle(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabagriplus);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack)
	{
		return true;
	}
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(ItemInit.MORTAR_PESTLE);
    }
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
