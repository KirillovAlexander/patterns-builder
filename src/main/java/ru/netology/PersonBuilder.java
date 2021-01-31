package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder(String surname, int age, String address) {
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть меньше 0");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (canCreatePerson()) {
            Person person = (age == 0) ?
                    new Person(name, surname) :
                    new Person(name, surname, age);
            person.setAddress(address);
            return person;
        } else {
            throw new IllegalArgumentException("Не могу создать объект Person");
        }
    }

    private boolean canCreatePerson() {
        if (name == null) throw new IllegalStateException("Не указано имя");
        if (surname == null) throw new IllegalStateException("Не указана фамилия");
        return true;
    }

}
