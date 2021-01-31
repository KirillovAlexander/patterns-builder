package ru.netology;

public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public void happyBirthday() {
        this.age++;
    }

    public boolean hasAge() {
        return !(age == -1);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddress() {
        return !(address == null);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(surname, 0, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
