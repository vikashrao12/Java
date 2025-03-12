package Constructor;

import ClaasAndObject.Car;

public class car {

     static int noOfCarSold ;

    int noOfWheels ;
    String color;
    float maxSpeed;
    float currentFuelLevelInLiters;
    int noOfSheets;

    static {
        noOfCarSold = 0;
    }
    {
        noOfCarSold++;                  //CODE BLOCK ************************
    }

    car(String color){             //Parameter Constructor  *******************************
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        noOfSheets = 4;
        currentFuelLevelInLiters = 2;
    }
    car(){                                                //  Default Constructor *******************
        noOfWheels = 4;
        color = "Black";
        maxSpeed = 150;
        noOfSheets = 4;
        currentFuelLevelInLiters = 2;
    }


}
