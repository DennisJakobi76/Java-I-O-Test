package javaioexamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamExample {

    public static final String FILE_NAME = "example.txt";

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String inputText = scanner.nextLine();

        try {
            OutputStream outputStream = new FileOutputStream(FILE_NAME, true);
            byte[] inputTextAsByteArray = inputText.getBytes();
            outputStream.write(inputTextAsByteArray);

            System.out.println("\n\nWrite operation was successfull.");
            System.out.println("Text has been written to " + FILE_NAME);

            outputStream.flush();
            outputStream.close();
            scanner.close();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
