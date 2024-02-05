package dev.enums;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        System.out.println(dayNameByIndex(WeekDay.MONDAY));
        System.out.println(dayNameByIndex(WeekDay.TUESDAY));
        System.out.println(dayNameByIndex(null));
        System.out.println(WeekDay.FRIDAY.getIndex());
        System.out.println(WeekDay.FRIDAY.getName());
        System.out.println();
        WeekDay.TUESDAY.setStaticField("Static field");
        WeekDay.WEDNESDAY.setNonStaticField("Non static field");

        System.out.println(WeekDay.TUESDAY.getStaticField());
        System.out.println(WeekDay.WEDNESDAY.getNonStaticField());
    }


    public static String dayNameByIndex(WeekDay day) {
        if (day == null) {
            return "Unknown";
        }
        switch (day) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
            default:
                return "Unknown";
        }
    }

    private void part1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 2);

        System.out.println(map.size());
        System.out.println(map);
        for (final Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (final String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
