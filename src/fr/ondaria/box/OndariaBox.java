package fr.ondaria.box;

import fr.ondaria.box.commands.Cbox;
import fr.ondaria.box.listener.LInvetoryInteract;
import fr.ondaria.box.listener.LPlayerInteract;
import fr.ondaria.box.manager.MConfig;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class OndariaBox extends JavaPlugin {

    @Override
    public void onEnable() {
        log = Logger.getLogger("Minecraft");
        instance = this;
        mConfig = new MConfig();

        mConfig.createBoxConfig();
        getServer().getPluginCommand("ondariacrate").setExecutor(new Cbox());
        getServer().getPluginManager().registerEvents(new LPlayerInteract(), this);
        getServer().getPluginManager().registerEvents(new LInvetoryInteract(), this);
        if(!getConfig().getBoolean("plugin.enable"))log.severe("[-] OndariaBox disabled in config.yml");return;
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private static Logger log;
    public static Logger getLog(){return log;}
    private static OndariaBox instance;
    private  MConfig mConfig;
    public  MConfig getmConfig(){return mConfig;}
    public static OndariaBox getInstance(){return instance;}
}
