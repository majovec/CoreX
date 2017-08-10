package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

/**
 * @author PikyCZ
 */
public class BlockChorusFlower extends BlockSolid {

    public BlockChorusFlower(int meta) {
        super(meta);
    }
    
    public BlockChorusFlower() {
        this(0);
    }
    
    @Override
    public double getHardness() {
        return 0.4;
    }
    
    @Override
    public double getResistance() {
        return 2;
    }
    
    @Override
    public String getName() {
        return "BlockChorusFlower";
    }

    @Override
    public int getId() {
        return CHORUS_FLOWER;
    }
    
    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }
    
}
