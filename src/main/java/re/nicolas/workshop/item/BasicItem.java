package re.nicolas.workshop.item;
import net.minecraft.item.Item;
import re.nicolas.workshop.SuperMod;
import re.nicolas.workshop.SuperModCreativeTabs;

public class BasicItem extends Item {
    public BasicItem(String name) {
        SuperModItems.setItemName(this, name);
        setCreativeTab(SuperMod.CREATIVE_TABS);
    }

}
