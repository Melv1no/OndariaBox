package fr.ondaria.box.manager;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MLoot {

    public MLoot(){

    }

    public boolean isCommand;
    public void genLoot(ItemStack box){
        List<ItemStack> loots = new MBoxes().getCustomLoot(box);

    }

}
