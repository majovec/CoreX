package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

/**
 * @author PikyCZ
 */
public class BlockChorusPlant extends BlockTransparent {

    public BlockChorusPlant(int meta) {
        super(meta);
    }

    public BlockChorusPlant() {
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
        return "BlockChorusPlant";
    }

    @Override
    public int getId() {
        return CHORUS_PLANT;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[]{
            toItem()
        };
    }

}
