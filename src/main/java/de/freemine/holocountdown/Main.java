package de.freemine.holocountdown;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import de.freemine.holocountdown.command.command_holocountdown;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author martin
 */
public class Main extends JavaPlugin {
    private ArrayList<Hologram> holograms = new ArrayList<Hologram>();
    private HashMap<Hologram, Boolean> active = new HashMap<Hologram, Boolean>();
    public Main plugin = this;

    @Override
    public void onEnable() {
        getCommand("HoloCountdown").setExecutor(new command_holocountdown(this));
        getLogger().info("enabled");
        saveConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("disabled");
    }

    /**
     * @return a list with all Holograms containing active and inactive ones
     */
    public ArrayList<Hologram> getHolograms() {
        return holograms;
    }

    /**
     * @return if a holograms countdown is active or not
     */
    public HashMap<Hologram, Boolean> getActive() {
        return active;
    }
}
