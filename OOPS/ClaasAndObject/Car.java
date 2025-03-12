package ClaasAndObject;

public class Car {
    int noOfWheels ;
    String colour;
    float maxSpeed;
    float currentFuelLevelInLiters;
    int noOfSheets;
    public Car start() {
        if (currentFuelLevelInLiters == 0) {
            System.out.println("car is out of fuel ,can't start");
        } else if (currentFuelLevelInLiters < 5) {
            System.out.println("your car is reserved mod,please refuel");

        }
        else {
            System.out.println("car is started , ...bhuurr...");
        }
        return this;
    }

    public void drive(){
            currentFuelLevelInLiters--;
            System.out.println("car is driving Now");


    }
    public void addFuel(float currentFuelLevelInLiters){
        this.currentFuelLevelInLiters += currentFuelLevelInLiters; // this type use this keyword 
    }

    public float getCurrentFuelLevelInLiters(){
        return currentFuelLevelInLiters;
    }

}
