package hw_08_11_2023;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListFileTree {
    public static void main(String[] args) {
        File directory = new File("path/to/directory"); // Замените на путь к вашей папке
        listFilesForFolder(directory);
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                if (fileEntry.getName().endsWith(".txt")) {
                    System.out.println("Файл: " + fileEntry.getAbsolutePath());
                    try {
                        Scanner scanner = new Scanner(fileEntry);
                        while (scanner.hasNextLine()) {
                            System.out.println(scanner.nextLine());
                        }
                        scanner.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
