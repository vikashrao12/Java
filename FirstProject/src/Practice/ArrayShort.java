package Practice;

import java.util.Scanner;

public class ArrayShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements :");
        int size = sc.nextInt();
        int [] nums = new int[size];
        int i = 0;
        while (i<size){
            System.out.println("enter the element :");
            nums[i] = sc.nextInt();
            i++;
        }
        if (isIncreasing(nums) || isDecreasing(nums)){
            System.out.println("your array is shorted ");
        }
        else {
            System.out.println("your array is not short ");
        }

    }
    public static boolean isIncreasing(int [] nums ){
        int i=1;
        int increasing  = nums[0];
        while (i< nums.length){
            if (nums[i] < nums[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] nums){
        int i = 1;
        int D = nums[0];
        while (i< nums.length){
            if (nums[i]> nums[i-1]){
                return false;
            }
            i++;
        }
        return true;

    }
}
