package TernaryOprator;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your mark :");
        int mark = sc.nextInt();
        String category = mark >80 ? "Your mark is High " : (mark>50 ? "your mark is Moderate ": "your mark is Low");
        System.out.println(category);
    }
}
