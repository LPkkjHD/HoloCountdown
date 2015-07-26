package de.freemine.holocountdown.util;

/**
 * @author martin
 */
public class utils {
    public static String getPrefix() {
        return "§8§l[§9H§6C§8§l] ";
    }

    public static String getError() {
        return "§4ERROR:§c ";
    }

    public static String getWarningColor() {
        return "§c";
    }

    public static String getPRIMARY() {
        return "§6";
    }

    public static String getPRIMARY_SHADOW() {
        return "§e";
    }

    public static String getSECONDARY() {
        return "§9";
    }

    public static String getSECONDARY_SHADOW() {
        return "§b";
    }

    public static String header(String s) {
        return "§b█████████§9[ §3" + s + " §9]§b██████████";
    }

    public static String footer() {
        return "§b███████████████████████████████";
    }

}
