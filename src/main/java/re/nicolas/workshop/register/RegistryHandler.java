package re.nicolas.workshop.register;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import re.nicolas.workshop.SuperMod;
import net.minecraft.item.Item;
import re.nicolas.workshop.item.SuperModItems;

@Mod.EventBusSubscriber(modid = SuperMod.MODID)
public class RegistryHandler {
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        for (Item item: SuperModItems.ITEMS) {
            event.getRegistry().register(item);
        }
    }
}
