package agriplus.mod.tabs;

import agriplus.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AgriPlusTab  extends CreativeTabs
{
	public AgriPlusTab(String label) {
		super("agriplustab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.MORTAR_PESTLE);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
}