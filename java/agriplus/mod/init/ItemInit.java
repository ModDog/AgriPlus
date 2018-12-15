package agriplus.mod.init;

import java.util.ArrayList;
import java.util.List;

import agriplus.mod.items.ItemBaseEIngredients;
import agriplus.mod.items.ItemBaseFood;
import agriplus.mod.items.ItemBaseIngredient;
import agriplus.mod.items.seeds.ItemBarleySeed;
import agriplus.mod.items.tools.ItemCuttingKnife;
import agriplus.mod.items.tools.ItemMortarPestle;
import agriplus.mod.items.tools.ItemRoller;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList <Item>();
	
	//Tools
	public static final Item CUTTING_KNIFE = new ItemCuttingKnife("cutting_knife");
	public static final Item MORTAR_PESTLE = new ItemMortarPestle("mortar_pestle");
	public static final Item ROLLER = new ItemRoller("roller");
	
	//Seeds
	public static final Item BARLEY_SEED = new ItemBarleySeed("barley_seed");
	
	//Ingredients
	public static final Item BARLEY = new ItemBaseIngredient("barley");
	public static final Item FLOUR = new ItemBaseIngredient("flour");
	public static final Item DOUGH = new ItemBaseIngredient("dough");
	//public static final Item ROLLED_DOUGH = new ItemBaseIngredient("rolled_dough");
	public static final Item COOKIE_DOUGH = new ItemBaseIngredient("cookie_dough");
	public static final Item CC_COOKIE_DOUGH = new ItemBaseIngredient("cc_cookie_dough");
	public static final Item SUGAR_COOKIE_DOUGH = new ItemBaseIngredient("sugar_cookie_dough");
	
	//Edible Ingredients
	public static final Item SLICED_BREAD = new ItemBaseEIngredients("sliced_bread", 1, 1.0f, false);
	public static final Item SLICED_MEAT_RAW = new ItemBaseEIngredients("sliced_meat_raw", 1, 0.5f, true);
	public static final Item SLICED_MEAT_COOKED = new ItemBaseEIngredients("sliced_meat_cooked", 2, 1.5f, true);
	public static final Item CHEESE = new ItemBaseEIngredients("cheese", 3, 0.5f, false);
	public static final Item SLICED_CHEESE = new ItemBaseEIngredients("sliced_cheese", 1, 0.0f, false);
	
	//Food
	public static final Item MEAT_SANDWICH = new ItemBaseFood("meat_sandwich", 6, 4.5f, false);
	public static final Item MEAT_CHEESE_SANDWICH = new ItemBaseFood("meat_cheese_sandwich", 8, 5.5f, false);
	public static final Item CHOCOLATE_CHIP_COOKIE = new ItemBaseFood("chocolate_chip_cookie", 2, 1.0f, false);
	public static final Item SUGAR_COOKIE = new ItemBaseFood("sugar_cookie", 2, 1.0f, false);
}
