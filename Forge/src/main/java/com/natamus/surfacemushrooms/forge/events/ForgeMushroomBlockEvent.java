package com.natamus.surfacemushrooms.forge.events;

import com.natamus.surfacemushrooms.events.MushroomBlockEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeMushroomBlockEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeMushroomBlockEvent.class);

		PlayerInteractEvent.RightClickBlock.BUS.addListener(ForgeMushroomBlockEvent::onMushroomPlace);
	}

    @SubscribeEvent
    public static boolean onMushroomPlace(PlayerInteractEvent.RightClickBlock e) {
        if (!MushroomBlockEvent.onMushroomPlace(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec())) {
            return true;
        }
        return false;
    }
}