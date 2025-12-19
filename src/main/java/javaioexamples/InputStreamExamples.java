package javaioexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExamples {

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("example.txt");
            int length = inputStream.available();
            System.out.println("Number of bytes available in the file: " + length);

            System.out.println("Reading data...");

            byte[] characterArray = new byte[length];
            inputStream.skip(7); // Skipping first 7 bytes (characters)
            int characterRead = inputStream.read(characterArray, 0, 4); // Reading next 3 bytes (characters)


            for (int offset = 0; offset < 4; offset++) {
                String readString = new String(characterArray, offset, 1);
                System.out.print(readString);
                Thread.sleep(500);
            }



            /*
            System.out.println("Reading data...");
            int eachCharAsDecimal = inputStream.read();
            while (eachCharAsDecimal != -1) {
                char eachCharacter = (char) eachCharAsDecimal;
                String eachCharAsString = String.valueOf(eachCharacter);
                System.out.print(eachCharAsString);
                Thread.sleep(280); // Adding delay to see the reading process slowly

                eachCharAsDecimal = inputStream.read();

            } */

            System.out.println();
            System.out.println("\n\nRead operation was successfull.");
            inputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

    }

