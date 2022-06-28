package re.nicolas.workshop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import re.nicolas.workshop.item.SuperModItems;

public class SuperModCreativeTabs extends CreativeTabs {
    public SuperModCreativeTabs() {
        super(SuperMod.MODID +  "_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(SuperModItems.BASICITEM);
    }
}
