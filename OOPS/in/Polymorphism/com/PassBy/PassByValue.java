package in.Polymorphism.com.PassBy;

public class PassByValue {

    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int sum = add(x,y);
        System.out.printf("x = %d  ,y =  %d = , sum =  %d   ",x ,y,sum);
    }

    public static int add(int a ,int b ){

        a=99;   // no effect real value x and y because its a value
        return  a+b;

    }
}
