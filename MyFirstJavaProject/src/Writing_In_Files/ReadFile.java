package Writing_In_Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static  void main(String[] args) {
        //BufferedReader + FileReader: best for handling text line-by-line - this method
        //FileInputStream: best for binary files
        //RandomAccessFile: Best for read/write specific options of a large file

        String filePath = "test.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Couldn't locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }
}
