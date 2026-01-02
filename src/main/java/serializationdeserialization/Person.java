package serializationdeserialization;

import java.io.Serializable;

public class Person implements Serializable {

    String name, surname;
    int age;
    boolean married;

    public Person() {
    }

    public Person(String name, String surname, int age, boolean married) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.married = married;
    }

    @Override
    public String toString() {
        return  "Name = " + this.name +
                "\nSurname = " + this.surname +
                "\nAge = " + this.age +
                "\nMarried = " + this.married;
    }
}
