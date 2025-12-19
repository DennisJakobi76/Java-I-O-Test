package javaioexamples;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterClassExamples {

    public static final String FILE_NAME = "example_writer.txt";

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String inputText = scanner.nextLine();

        Writer writer = null;
        try {
           writer = new FileWriter(FILE_NAME, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.write(inputText);
        System.out.println("\n\nWrite operation was successfull.");
        System.out.println("Text has been written to " + FILE_NAME);
        writer.flush();
        writer.close();
        scanner.close();

    }
}
