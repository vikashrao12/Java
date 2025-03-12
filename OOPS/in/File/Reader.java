package in.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String fileName = "Example.txt";
        try (FileReader read = new FileReader(fileName)){
            int r = 0;
            do {
                r =  read.read();
                System.out.print((char)r);
            }while (r != -1);

        }
        catch (IOException ex){
            System.out.printf("exception occurred %s \n",ex.getMessage());

        }
    }
}
