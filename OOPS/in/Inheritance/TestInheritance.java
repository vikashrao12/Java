package in.Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();


        TwoWheeler TwoW = new TwoWheeler();
        TwoW.commute();
        TwoW.balance();


        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();



    }
}
