package Array;

public class Sorted {
    public static void main(String[] args) {
        int [] arr = ArrayUtility.inputArray();
        if (increasing(arr) || decreasing(arr)){
            System.out.println("Your Number is Shorted:");
            ArrayUtility.showArray(arr);
        }
        else {
            System.out.println("Your Number is not Shorted:");
            ArrayUtility.showArray(arr);
        }
    }
    public static boolean increasing(int [] arr){
        int i = 1;
        while (i< arr.length){
            if (arr[i]<arr[i-1]){
                return false;

            }
            i++;
        }
        return true;

    }
    public static boolean decreasing(int [] arr){
        int i = 1;
        while (i< arr.length){
            if (arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
