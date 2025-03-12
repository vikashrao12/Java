package in.Polymorphism;

public class Test {
    public static void main(String[] args) {
        car  c = new car();
        Vehicle  v = new Vehicle();


        Vehicle vCar = new  car(); //because Vehicle is a car called Upcasting
        //car c2 = (car)new Vehicle();  // because vehicle is parents class

        casTest(c);



    }
    public static void casTest(Vehicle veh){
        car vehicle =(car) veh;   ///this condition no error
        vehicle.start();

        ((car) veh).noOfDoor();
        // veh.noOfDoor();       not run  because vehicle refarence has not a no of door  
        vehicle.noOfDoor();
    }
}
