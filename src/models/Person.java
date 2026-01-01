package models;
public abstract class Person implements Payable {
    private static int nextId = 0;
    private int id;
    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.id = ++nextId;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }


}