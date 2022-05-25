package fr.ondaria.box.manager;

import fr.ondaria.box.OndariaBox;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class MConfig {

    private static File customConfigFile;

    private static OndariaBox instance = OndariaBox.getInstance();
    private static FileConfiguration customConfig;

    public MConfig() {
    }

    public  FileConfiguration getBoxConfig() {
        return customConfig;
    }

    public void createBoxConfig() {
        customConfigFile = new File(instance.getDataFolder(), "box.yml");
        if (!customConfigFile.exists()) {
            customConfigFile.getParentFile().mkdirs();
            instance.saveResource("box.yml", false);
        }

        customConfig = new YamlConfiguration();
        try {
            customConfig.load(customConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
            instance.getLog().severe("§c[-] OndariaBox box.yml cannot be created MConfig.createBoxConfig");
        }
    }
}
