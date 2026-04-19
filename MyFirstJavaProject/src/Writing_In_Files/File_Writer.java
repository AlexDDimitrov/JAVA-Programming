package Writing_In_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
    public static  void main(String[] args) {
        //fileWriter - good for small or medium-sized text files - this method
        //bufferedWriter - better performance for large amount of text
        //printWriter - best for structured data
        //fileOutputStream - best fo binary files

        String filePath = "";
        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("I like pizza!\nBuy me pizza");
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
