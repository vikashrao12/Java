package Array;

public class SumDiagonal {
    public static void main(String[] args) {
        int[][] newArr = ArrayUtility.input2DArray();
        System.out.println("sum of diagonal elements is : " + SumOfDiagonal(newArr));

    }
    public static long SumOfDiagonal(int[][] newArr){
        long leftSum = SumOfLeftDiagonal(newArr);
        long rightSum = SumOfRightDiagonal(newArr);
        long sum = leftSum+rightSum;
        if (newArr.length%2 != 0){
            int ind = newArr.length/2;
            sum -= newArr[ind][ind];
        }
        return sum;
    }
    public static long SumOfLeftDiagonal(int[][] newArr){
        long sum = 0;
        int i = 0;
        while (i< newArr.length){
            sum += newArr[i][i];
            i++;
        }
        return sum;
    }
    public static long SumOfRightDiagonal(int[][] newArr){
        long sum = 0;
        int i = 0;
        while (i< newArr.length){
            int col = newArr.length-1 - i;
            sum += newArr[i][col];
            i++;
        }
        return sum;
    }
}
