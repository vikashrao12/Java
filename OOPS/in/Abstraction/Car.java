package in.Abstraction;

public class Car extends vehicle{


    private  int noOfDoor;
    public Car() {
        super(4);
    }

    @Override
    public void startSound() {
        System.out.println("vroooomm ..........");
    }
}
