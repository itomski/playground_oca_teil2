package de.lubowiecki.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Berlin", 3_600_000);
        einwohner.put("München", 1_400_000);
        einwohner.put("Kiel", 400_000);

        System.out.println(einwohner.get("Kiel"));

        einwohner.put("München", 1_800_000);

        System.out.println(einwohner);

        //Map<LocalDate, Map<LocalTime, Termin>> cal = new TreeMap<>();

        System.out.println();

        for(String key : einwohner.keySet()) {
            System.out.println(einwohner.getOrDefault(key, 0));
        }

        System.out.println();

        for(int value : einwohner.values()) {
            System.out.println(value);
        }

        System.out.println();

        for(Map.Entry<String, Integer> eintrag : einwohner.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }
    }
}
