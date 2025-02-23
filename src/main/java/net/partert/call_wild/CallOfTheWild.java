package net.partert.call_wild;

import net.fabricmc.api.ModInitializer;

import net.partert.call_wild.block.ModBlocks;
import net.partert.call_wild.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CallOfTheWild implements ModInitializer {
	public static final String MOD_ID = "call_wild";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.regModItems();
		ModBlocks.regModBlocks();
	}
}