package re.nicolas.workshop.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import re.nicolas.workshop.SuperMod;

import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

@Mod.EventBusSubscriber(modid = SuperMod.MODID, value = Side.CLIENT)
public class SuperModItems {
    public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
    public static final Item BASICITEM = new BasicItem("basic_item");
    public static void setItemName (Item item, String name) {
        item.setRegistryName(SuperMod.MODID ,name).setUnlocalizedName(SuperMod.MODID + "." + name);
        ITEMS.add(item);
    }

    public static void setItemBlockName(Item item , Block block) {
            item.setRegistryName(block.getRegistryName());
            ITEMS.add(item);
    }

    @SideOnly(Side.CLIENT) // Forge annotation for Side managing
    @SubscribeEvent // Forge annotation to subscribe to an event
    protected static void registerItemModels (ModelRegistryEvent e) {
        ITEMS.forEach(item->registerModel(item, 0)); // A simple forEach to call the method below
    }

    @SideOnly (Side.CLIENT)
    protected static void registerModel (Item item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory" ));
    }

}
