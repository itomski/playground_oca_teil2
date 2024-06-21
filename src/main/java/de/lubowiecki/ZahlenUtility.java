package de.lubowiecki;

public class ZahlenUtility {

    private ZahlenUtility() {
    }

    public static String hex(int zahl) {
        return Integer.toHexString(zahl);
    }

    public static String oct(int zahl) {
        return Integer.toOctalString(zahl);
    }

    public static String bin(int zahl) {
        return Integer.toBinaryString(zahl);
    }
}
