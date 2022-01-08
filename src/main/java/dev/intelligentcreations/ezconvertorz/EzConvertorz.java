package dev.intelligentcreations.ezconvertorz;

import dev.intelligentcreations.ezconvertorz.blockentities.BlockEntityRegistry;
import dev.intelligentcreations.ezconvertorz.blocks.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EzConvertorz implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("ezconvertorz");

	@Override
	public void onInitialize() {
		LOGGER.info("Load!");
		BlockRegistry.register();
		BlockEntityRegistry.register();
	}
}
