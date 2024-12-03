package tech.reliab.course.polyvyanyLab.bank.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private static int currentId;
    protected int id;
    protected String name;
    protected LocalDate birthDate;

    public Person() {
        id = currentId++;
        name = "Null";
        birthDate = null;
    }

    public Person(Person person) {
        id = person.id;
        name = person.name;
        birthDate = person.birthDate;
    }

    public Person(String _name, LocalDate _birthDate) {
        this();
        name = _name;
        birthDate = _birthDate;
    }

    public Person(int _id, String _name, LocalDate _birthDate) {
        id = _id;
        name = _name;
        birthDate = _birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate _birthDate) {
        birthDate = _birthDate;
    }

    @Override
    public String toString() {
        return "Person:{" +
                "\n id='" + getId() + "'" +
                ",\n name='" + getName() + "'" +
                ",\n birthdDate='" + getBirthDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "'" +
                "\n}";
    }
}