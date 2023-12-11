package com.natamus.surfacemushrooms.forge.events;

import com.natamus.surfacemushrooms.events.MushroomBlockEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeMushroomBlockEvent {
    @SubscribeEvent
    public void onMushroomPlace(PlayerInteractEvent.RightClickBlock e) {
        if (!MushroomBlockEvent.onMushroomPlace(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec())) {
            e.setCanceled(true);
        }
    }
}