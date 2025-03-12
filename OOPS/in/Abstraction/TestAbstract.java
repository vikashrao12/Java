package in.Abstraction;

public class TestAbstract {
    public static void main(String[] args) {
        // vehicle v1 = new vehicle(2);  not work because vehicle class is abstract
        Car c1 =new Car();
        c1.commute();
        c1.startSound();
    }
}
