package Practice;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the umber of elements :");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i<size){
            System.out.print("enter the elements :");
            nums[i] = sc.nextInt();
            i++;

        }
        System.out.print("enter the elements you want to find occurs :");
        int num =  sc.nextInt();
        System.out.println("your number is occurrence " + occurrence(nums,num) + " times ");



    }
    public static int occurrence(int[] nums, int num ){
        int occ = 0;
        int i = 0;
        while (i< nums.length){
            if (nums[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
