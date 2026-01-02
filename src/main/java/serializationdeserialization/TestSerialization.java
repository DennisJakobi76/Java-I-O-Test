package serializationdeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestSerialization {

    public static void main(String[] args) throws IOException {

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("John", "Doe", 30, false));
        personList.add(new Person("Jane", "Smith", 25, true));
        personList.add(new Person("Alice", "Johnson", 28, false));
        personList.add(new Person("Bob", "Brown", 35, true));

        FileOutputStream fileOut = new FileOutputStream("persons.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(personList);

        out.close();
        fileOut.close();

        System.out.println("Serialized data is saved in persons.txt");
    }
}
