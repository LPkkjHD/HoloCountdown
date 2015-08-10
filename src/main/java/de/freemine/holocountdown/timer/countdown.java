package de.freemine.holocountdown.timer;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import de.freemine.holocountdown.Main;
import org.bukkit.Location;

/**
 * @author martin
 */
public class countdown implements Runnable {
    private int counting;
    private Location location;
    private Main main;

    private Integer linetoupdate;

    public countdown(Main main, int counting, Location location) {
        this.main = main;
        this.counting = counting;
        this.location = location;
    }

    public void run() {
        //read the config and set up the Hologram
        int line = 1;
        int lines = main.getConfig().getInt("count");

        Hologram holo = HologramsAPI.createHologram(main.plugin, location);

        while (line <= lines) {
            if (main.getConfig().getString(String.valueOf(line)).contains("{COUNTDOWN}")) {
                linetoupdate = line;
            }
            line++;
        }

        //Count down
        while (counting > 0) {
            //TODO
            //holo.appendTextLine(main.getConfig().getString(String.valueOf(linetoupdate).replace("{COUNTDOWN}", String.valueOf(counting))));
            System.out.println(counting);
            counting--;
        }

    }
}
