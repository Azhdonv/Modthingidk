package net.av.idkyet;

import net.av.idkyet.block.ModBlocks;
import net.av.idkyet.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IdkYet implements ModInitializer {
	public static final String MOD_ID = "idkyet";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}


