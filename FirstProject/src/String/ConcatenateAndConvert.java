package String;

import java.util.Scanner;

public class ConcatenateAndConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first string : ");
        String str1 = sc.next();
        System.out.print("enter the second string : ");
        String str2 = sc.next();

//        String str3 = str1 + str2;
//
//        System.out.printf("%S",str3);


        String str3 = str1.concat(" ").concat(str2);

        System.out.println(str3.toUpperCase());
    }

}
