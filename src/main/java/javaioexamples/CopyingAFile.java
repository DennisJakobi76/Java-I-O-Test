package javaioexamples;

import java.io.*;
import java.util.Scanner;

public class CopyingAFile {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter the source file path: ");
//        String sourceFilePath = scanner.nextLine();
//        System.out.print("Please enter the destination file path: ");
//        String destinationFilePath = scanner.nextLine();

        try {
            Reader reader = new FileReader("example_writer.txt");
            Writer writer = new FileWriter("C:\\Users\\jakobi\\Test_IO\\copied_example.txt");

            if (reader.ready()) {
                System.out.println("Data is reading...");

                int characterRead;

                do {
                    characterRead = reader.read();
                    if (characterRead != -1) {
                        writer.write(characterRead);
                    }
                }while (characterRead != -1);
                System.out.println("File has been copied successfully.");
            }
            reader.close();
            writer.flush();
            writer.close();
            //scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
