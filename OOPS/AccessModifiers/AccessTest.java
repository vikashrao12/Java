package AccessModifiers;

public class AccessTest {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.color = "red";
        obj.modelNo = "swift123";
       // obj.cost = 45522;  // not access because is private

        obj.speed = 250; //Access Because is default access modifier


        // public mens access anywhere ;
        // private mens access only in same class ;
        // Default mens access only in package ;
    }
}
