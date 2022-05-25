package fr.ondaria.box.manager;

import fr.ondaria.box.OndariaBox;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MBoxes {

    private OndariaBox instance = OndariaBox.getInstance();

    public MBoxes() {
        boxes = new ArrayList<>();
    }

    /*
     * box:
     *   items:
     *     item-id:
     *     item-name:
     *     item-glow:
     *     item-lore:
     *       - ""
     *       - ""
     *   reward:
     *     lootA:
     *       item-id:
     *       item-name
     *       item-glow:
     *       item-lore:
     *       command:
     *     lootB:
     * */
    private List<ItemStack> boxes;

    public List<ItemStack> getBoxes() {
        return boxes;
    }

    public void loadBoxes() {

    }

    private List<ItemStack> loots;

    public List<ItemStack> getLoots() {
        return loots;
    }

    public void loadLoots() {

    }

    private HashMap<ItemStack, List<ItemStack>> customBox;

    public List<ItemStack> getCustomLoot(ItemStack box) {

        for (Map.Entry<ItemStack, List<ItemStack>> entry : customBox.entrySet()) {
            if (entry.getKey().equals(box)) {
                return entry.getValue();
            }
        }
        return null;
    }
    public void getCustomBox(String box){
    }

}
