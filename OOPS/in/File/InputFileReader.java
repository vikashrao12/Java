package in.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InputFileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name of the file you want to read : ");
        String fileName = sc.next();
        try(FileReader read = new FileReader(fileName)) {
            int reader;
            while ((reader = read.read()) != -1){
                System.out.print((char) reader);
            }

        }catch (FileNotFoundException ex){
            System.out.printf("%s file not found " , fileName);
        }
        catch (IOException ex){
            System.out.printf(" Exception Occurred %s" , ex.getMessage());

        }
    }
}
