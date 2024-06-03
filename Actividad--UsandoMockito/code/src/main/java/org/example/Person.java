package org.example;

import java.time.LocalDate;

public class Person {
    private final Integer id;
    private final String first;
    private final String last;
    private final LocalDate dob;
    public Person(Integer id, String first, String last, LocalDate dob) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.dob = dob;
    }

    public String getFirst() {
        return first;
    }

}
