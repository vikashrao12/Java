package Practice;

import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int size = sc.nextInt();
        int [] arrr = new int[size];
        int i = 0;
        while(i<size ){
            System.out.print("enter your elements " + (i+1) + " : ");
            arrr[i] = sc.nextInt();
            i++;

        }
        System.out.println("sum of array is :" + sum(arrr));
        System.out.println("avg is array is  :" + avg(arrr));




        }
        public static long sum(int[] arrr){
        int i =0;
        long sum = 0;

        while (i< arrr.length){
            sum += arrr[i];
            i++;


        }
        return sum;
        }
        public static int avg(int[] arrr){
        long avg = sum(arrr)/ arrr.length;
        return (int) avg;
        }


    }

