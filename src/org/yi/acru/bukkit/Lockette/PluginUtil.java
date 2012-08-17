package org.yi.acru.bukkit.Lockette;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class PluginUtil {

	  public static Block getSignAttachedBlock(Block block)
	  {
	    if (block.getTypeId() != Material.WALL_SIGN.getId()) return null;

	    int face = block.getData() & 0x7;

	    if (face == 5) return block.getRelative(BlockFace.NORTH);
	    if (face == 3) return block.getRelative(BlockFace.EAST);
	    if (face == 4) return block.getRelative(BlockFace.SOUTH);
	    if (face == 2) return block.getRelative(BlockFace.WEST);

	    return null;
	  }

	  public static Block getTrapDoorAttachedBlock(Block block)
	  {
	    if (block.getTypeId() != 96) return null;

	    int face = block.getData() & 0x3;

	    if (face == 3) return block.getRelative(BlockFace.NORTH);
	    if (face == 1) return block.getRelative(BlockFace.EAST);
	    if (face == 2) return block.getRelative(BlockFace.SOUTH);
	    if (face == 0) return block.getRelative(BlockFace.WEST);

	    return null;
	  }

	  public static BlockFace getPistonFacing(Block block)
	  {
	    int type = block.getTypeId();

	    if ((type != Material.PISTON_BASE.getId()) && (type != Material.PISTON_STICKY_BASE.getId()) && (type != Material.PISTON_EXTENSION.getId())) {
	      return BlockFace.SELF;
	    }

	    int face = block.getData() & 0x7;

	    switch (face) { case 0:
	      return BlockFace.DOWN;
	    case 1:
	      return BlockFace.UP;
	    case 2:
	      return BlockFace.EAST;
	    case 3:
	      return BlockFace.WEST;
	    case 4:
	      return BlockFace.NORTH;
	    case 5:
	      return BlockFace.SOUTH;
	    }

	    return BlockFace.SELF;
	  }
	  
}
