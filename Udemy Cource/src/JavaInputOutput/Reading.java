package JavaInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int data;
            char[] block = new char[1000];
            while((data = reader.read(block)) != -1) {
                String content = new String(block, 0, data);
                System.out.printf("---> [%d chars] %s%n", data, content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------");

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("file.txt")
        )) {
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
