package JavaInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        File file = new File("f1-prophet.txt");
        Map<String, Integer> wordCounts = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String cleanWord = scanner.next()
                        .replaceAll("[\\p{Punct}]", "")
                        .toLowerCase();

                if (cleanWord.length() > 5) {
                    wordCounts.put(cleanWord, wordCounts.getOrDefault(cleanWord, 0) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Check the path: " + file.getAbsolutePath());
            return;
        }

        System.out.println("Top 10 Most Used Words (> 5 characters):");
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(entry -> System.out.printf("%s: %d times%n", entry.getKey(), entry.getValue()));
    }
}

