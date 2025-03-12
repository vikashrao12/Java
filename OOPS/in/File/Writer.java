package in.File;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName = "Example.txt";
//        try {
//            FileWriter writer = new FileWriter(fileName); // (this method want to close writer)
//            writer.write("this is the best course ");
//            for (int i=0;i<=50 ; i++){
//                writer.write(" * ");
//            }
//            writer.flush();
//            System.out.println("file write successfully ");
//
//        }catch (IOException ex){
//            System.out.printf("Exception occurred %s \n ",ex.getMessage());
//        }
        try (FileWriter writer = new FileWriter(fileName);){ // but this not want to close writer because  close java itself

            writer.write("this is the best course ");
            for (int i=0;i<=50 ; i++){
                writer.write(" * ");
            }
            writer.flush();
            System.out.println("file write successfully ");

        }catch (IOException ex) {
            System.out.printf("Exception occurred %s \n ", ex.getMessage());
        }
        }
}
