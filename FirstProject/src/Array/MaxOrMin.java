package Array;

public class MaxOrMin {
    public static void main(String[] args) {
        int [] arr = ArrayUtility.inputArray();
        System.out.println("Max Number is : "+max(arr));
        System.out.println("Min Number is : "+min(arr));

    }
    public static int max(int [] arr){
        int maxIs = 0;
        int i = 0;
        while (i< arr.length){
            if (arr[i]>=maxIs){
                maxIs = arr[i];
            }
            i++;
        }
        return maxIs;
    }
    public static int min(int [] arr){
        int minIs = arr[0];
        int i = 1;
        while (i< arr.length){
            if (minIs>arr[i]){
                minIs = arr[i];
            }
            i++;
        }
        return minIs;


    }
}
