package net.av.idkyet;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IdkYet implements ModInitializer {
	public static final String MOD_ID = "idkyet";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}


// https://www.youtube.com/watch?v=bVho57E_1hU&list=PLKGarocXCE1H_HxOYihQMq0mlpqiUJj4L&index=6 //