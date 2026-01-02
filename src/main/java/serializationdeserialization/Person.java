package serializationdeserialization;

import java.io.Serializable;

public class Person implements Serializable {

    String name, surname;
    int age;
    boolean married;
    transient long personId;
    transient Weights weight;
    double personWeight;

    public Person() {
    }

    public Person(String name, String surname, int age, boolean married, long personId, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.married = married;
        this.personId = personId;
        this.weight = new Weights(weight);
        personWeight = this.weight.weight;
    }

    @Override
    public String toString() {
        return  "Name = " + this.name +
                "\nSurname = " + this.surname +
                "\nAge = " + this.age +
                "\nMarried = " + this.married +
                "\nPerson ID = " + this.personId +
                "\nWeight = " + this.personWeight;
    }
}
