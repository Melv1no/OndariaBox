package fr.ondaria.box.commands;

import fr.ondaria.box.OndariaBox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Cbox implements CommandExecutor {


    /**
     * This class is for CBox Command
     * used for give to player a specific boxes
     */

    private OndariaBox instance = OndariaBox.getInstance();


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(!(args.length == 4))return false;
        if(!(args[0].equalsIgnoreCase("give")))return false;
        if(!(instance.getServer().getPlayer(args[1]) != null))return false;

        //We have give,player, boxnames, number

        return false;
    }
}
