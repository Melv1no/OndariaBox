package fr.ondaria.box.listener;

import fr.ondaria.box.manager.MBoxes;
import fr.ondaria.box.manager.MLoot;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;


public class LPlayerInteract implements Listener {
    /*
    * This class implements Listener and she used for the interaction of the player in the world
    * mainly used when player place box on the ground
    * */

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e){
        if(!e.hasItem())return;
        if(!e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) return;
        if(!e.getItem().hasItemMeta())return;
        if(new MBoxes().getBoxes().contains(e.getItem())){
            ItemStack box = e.getItem();

            e.getPlayer().getInventory().removeItem(box);

            int box_count = e.getItem().getAmount() - 1;
            box.setAmount(box_count);

            e.getPlayer().getInventory().addItem(box);


            if(new)


        }
    }
}
