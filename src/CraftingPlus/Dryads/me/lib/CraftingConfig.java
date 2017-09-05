package CraftingPlus.Dryads.me.lib;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftingConfig extends YamlConfiguration {   
   
    private File file;
    private String defaults;
    private JavaPlugin plugin;
   
    public CraftingConfig(JavaPlugin plugin, String fileName) {
        this(plugin, fileName, null);
    }
   
    public CraftingConfig(JavaPlugin pl, String fileName, String defaultsName) {
        this.plugin = pl;
        this.defaults = defaultsName;
        this.file = new File(pl.getDataFolder(), fileName);
        reload();
    }
   
    public void reload() {
       
        if (!file.exists()) {
           
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
               
            } catch (IOException exception) {
                exception.printStackTrace();
                plugin.getLogger().severe("Error @ " + file.getName());
            }
           
        }
       
        try {
            load(file);
           
            if (defaults != null) {
                InputStreamReader read = new InputStreamReader(plugin.getResource(defaults));
                FileConfiguration defaultsConfig = YamlConfiguration.loadConfiguration(read);       
               
                setDefaults(defaultsConfig);
                options().copyDefaults(true);
               
                read.close();
                save();
            }
       
        } catch (IOException exception) {
            exception.printStackTrace();
            plugin.getLogger().severe("Error @ " + file.getName());
           
        } catch (InvalidConfigurationException exception) {
            exception.printStackTrace();
            plugin.getLogger().severe("Error @ " + file.getName());
           
        }
       
    }
   
    public void save() {
       
        try {
            options().indent(2);
            save(file);
           
        } catch (IOException exception) {
            exception.printStackTrace();
            plugin.getLogger().severe("Error @ " + file.getName());
        }
       
    }
   
}
