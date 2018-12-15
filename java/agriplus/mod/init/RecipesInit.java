package agriplus.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesInit 
{
	public static void init()
	{
		GameRegistry.addSmelting(ItemInit.SLICED_MEAT_RAW, new ItemStack(ItemInit.SLICED_MEAT_COOKED, 1), 0.5f);
		GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ItemInit.CHEESE, 1), 0.5f);
		GameRegistry.addSmelting(ItemInit.CC_COOKIE_DOUGH, new ItemStack(ItemInit.CHOCOLATE_CHIP_COOKIE, 1), 0.5f);
		GameRegistry.addSmelting(ItemInit.SUGAR_COOKIE_DOUGH, new ItemStack(ItemInit.SUGAR_COOKIE, 1), 0.5f);
	}
}
