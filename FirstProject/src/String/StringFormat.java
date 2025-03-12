package String;

public class StringFormat {
    public static void main(String[] args) {
        String name = "vikash";
        int mark = 60;
        System.out.println("Hello ," + name + " your mark is : " +mark); //its contain too memory
        System.out.printf("Hello , %s your mark is : %d %n" ,name,mark );  //its contain less memory  and %S all charter are capital letter
        System.out.printf("Hello , %S your mark is : %d %n" ,name,mark); //or %10s is included 4 space then print name
        System.out.printf("Hello , %S your mark is : %0,7d %n" ,name,mark); // %0,1d  , %+,d %5d
    }
}
