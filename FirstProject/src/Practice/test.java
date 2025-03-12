package Practice;

public class test {
    public static void main(String[] args) {
        int N = 1010;
        System.out.println(countCommas(N));
    }

    public static int countCommas(int N){
        int totalCommas = 0;
        for(int  i = 1; i<=N; i++){
            String number = String.valueOf(i);
            int length = number.length();
            if (length>3){
                int commas = (length-1)/3;
                totalCommas += commas;

            }
        }
        return totalCommas;
    }
}
