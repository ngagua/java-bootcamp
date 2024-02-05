package dev.enums;

public enum WeekDay {
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4, "Thursday"),
    FRIDAY(5, "Friday"),
    SATURDAY(6, "Saturday"),
    SUNDAY(7, "Sunday");


    private final int index;
    private final String name;
    private static String staticField;

    private String nonStaticField;


    WeekDay(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public static String getStaticField() {
        return staticField;
    }

    public static void setStaticField(String staticField) {
        WeekDay.staticField = staticField;
    }

    public String getNonStaticField() {
        return nonStaticField;
    }

    public void setNonStaticField(String nonStaticField) {
        this.nonStaticField = nonStaticField;
    }
}
