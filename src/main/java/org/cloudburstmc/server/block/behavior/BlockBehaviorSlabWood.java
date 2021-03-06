package org.cloudburstmc.server.block.behavior;

import org.cloudburstmc.server.block.Block;
import org.cloudburstmc.server.block.BlockIds;
import org.cloudburstmc.server.block.BlockTraits;
import org.cloudburstmc.server.item.behavior.Item;
import org.cloudburstmc.server.item.behavior.ItemTool;
import org.cloudburstmc.server.utils.BlockColor;

public class BlockBehaviorSlabWood extends BlockBehaviorSlab {

    static final BlockColor[] COLORS = new BlockColor[]{
            BlockColor.WOOD_BLOCK_COLOR,
            BlockColor.SPRUCE_BLOCK_COLOR,
            BlockColor.SAND_BLOCK_COLOR,
            BlockColor.DIRT_BLOCK_COLOR,
            BlockColor.ORANGE_BLOCK_COLOR,
            BlockColor.BROWN_BLOCK_COLOR
    };

    public BlockBehaviorSlabWood() {
        super(BlockIds.WOODEN_SLAB, BlockIds.DOUBLE_WOODEN_SLAB);
    }

    @Override
    public int getBurnChance() {
        return 5;
    }

    @Override
    public int getBurnAbility() {
        return 20;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }

    @Override
    public float getResistance() {
        return 15;
    }

    @Override
    public boolean canHarvestWithHand() {
        return true;
    }

    @Override
    public Item toItem(Block state) {
        return Item.get(state.getState().resetTrait(BlockTraits.IS_TOP_SLOT));
    }
}
