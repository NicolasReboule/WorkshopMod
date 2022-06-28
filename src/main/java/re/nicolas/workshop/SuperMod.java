package re.nicolas.workshop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SuperMod.MODID, name = SuperMod.NAME, version = SuperMod.VERSION)
public class SuperMod
{
    public static final String MODID = "supermod";
    public static final String NAME = "Super Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static final CreativeTabs CREATIVE_TABS = new SuperModCreativeTabs();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
