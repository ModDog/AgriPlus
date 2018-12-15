package agriplus.mod.init;

import java.util.ArrayList;
import java.util.List;

import agriplus.mod.blocks.crops.BlockBarleyCrop;
import net.minecraft.block.Block;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList <Block>();
	
	public static final Block BarleyCrop = new BlockBarleyCrop("barley_crop");
}
