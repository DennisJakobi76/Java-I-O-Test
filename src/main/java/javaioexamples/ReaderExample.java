package javaioexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("example_writer.txt");
        System.out.println("Reading data...");
        if (reader.ready()) {
            do {
                try {
                    int characterRead = reader.read();
                    if (characterRead == -1) {
                        break;
                    }
                    char eachCharacter = (char) characterRead;
                    String eachCharAsString = String.valueOf(eachCharacter);
                    System.out.print(eachCharAsString);
                    Thread.sleep(280); // Adding delay to see the reading process slowly
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            while (reader.ready());
        }
        System.out.println();
        System.out.println("\n\nRead operation was successfull.");
        reader.close();
    }
}
