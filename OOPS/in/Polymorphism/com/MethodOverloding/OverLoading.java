package in.Polymorphism.com.MethodOverloding;

public class OverLoading {


    OverLoading(){
        System.out.println("Constructor over loading ");
    }

    OverLoading(String pop){
        System.out.println(pop);
    }

    public int add(int a, int b){
        return a+b;
    }

    public String add(String a, String b){
        return a+b;
    }

    public int add( int a, int b, int c , int d){
        return a+b+c+d;
    }


    public static void main(String[] args) {
        OverLoading over = new OverLoading();

        System.out.println( over.add(5,8));
    }
















}
