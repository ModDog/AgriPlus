package agriplus.mod;

import agriplus.mod.init.RecipesInit;
import agriplus.mod.proxy.CommonProxy;
import agriplus.mod.tabs.AgriPlusTab;
import agriplus.mod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	public static final CreativeTabs tabagriplus = new AgriPlusTab("tabagriplus").setBackgroundImageName("item_search.png");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		System.out.println(Reference.NAME + " Pre Init Complete");
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		RecipesInit.init();
		System.out.println(Reference.NAME + " Init Complete");
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		System.out.println(Reference.NAME + " Post Init Complete");
	}
}