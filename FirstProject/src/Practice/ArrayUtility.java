package Practice;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements :");
        int size = sc.nextInt();
        int [] nums = new int[size];
        int i = 0;
        while(i<size){
            System.out.println("please enter the elements " + (i+1) + " : ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;




    }


}
