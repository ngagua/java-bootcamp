package dev.enums;

public class Person {
    private String name;


    private String personNo;

    public Person(String personNo) {
        this.personNo = personNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
