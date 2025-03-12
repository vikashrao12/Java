package Constructor;

public class Driver {
    public static void main(String[] args) {
        car swift = new car("red");
        car thar = new car();
        System.out.println(swift.color);
        System.out.println(thar.color);
    }
}
