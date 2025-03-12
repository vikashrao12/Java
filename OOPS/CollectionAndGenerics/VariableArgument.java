package CollectionAndGenerics;

import java.util.Scanner;

public class VariableArgument {
    public static void main(String... args) {  // its also work
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(4,5,8,6));
        System.out.println(sum(445,568,1555,521));
       // System.out.println(sum()); // without first and second its run away but including first second that  not run

    }
    public static int sum(int first, int second,int... a){ // that use for any number of integer contain and add (... its ellipsis)
                                                            // its run for 0 elements that condition memory use for
                                                            // solve this problem at least tack two int and variable
        int sum = 0;                                         // so write (int first ,int second , int... a) that type
        for (int i : a) {
            sum += i;

        }
        return sum;


    }



}
