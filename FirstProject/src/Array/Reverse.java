package Array;

public class Reverse {
    public static void main(String[] args) {
        int [] newArr = ArrayUtility.inputArray();
        reverse(newArr);
        ArrayUtility.showArray(newArr);

    }
    public static void reverse(int [] arr){
        int i = 0;
        while (i< arr.length/2){
            int rev = arr[i];
            arr[i] = arr[(arr.length-1 )-i];
            arr[arr.length-1 - i] = rev;
            i++;
        }
    }
}
