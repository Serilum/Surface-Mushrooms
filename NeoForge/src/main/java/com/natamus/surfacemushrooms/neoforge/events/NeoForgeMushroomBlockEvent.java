package com.natamus.surfacemushrooms.neoforge.events;

import com.natamus.surfacemushrooms.events.MushroomBlockEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeMushroomBlockEvent {
	@SubscribeEvent
	public static void onMushroomPlace(PlayerInteractEvent.RightClickBlock e) {
		if (!MushroomBlockEvent.onMushroomPlace(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec())) {
			e.setCanceled(true);
		}
	}
}