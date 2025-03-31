package test.azxyn.stuff;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.azxyn.stuff.items.ModItems;

public class Axyzn implements ModInitializer {
	public static final String MOD_ID = "axyzn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}