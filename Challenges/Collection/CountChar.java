package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountChar {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter the string : ");
        String str = sc.next();

        for (char c : str.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("your string has %d unique characters  " , unique.size());
    }
}
