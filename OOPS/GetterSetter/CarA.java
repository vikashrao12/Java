package GetterSetter;

public class CarA {
    private String color;
    private String modelNo;
    private double fuelLevel;
    private long cost;

      public CarA(String color, String modelNo, double fuelLevel, long cost) {
        this.color = color;
        this.modelNo = modelNo;
        this.fuelLevel = fuelLevel;
        this.cost = cost;
    }

    public String getColor(){   // getter
        return color;
    }
    public void setColor(String color){
           this.color = color;
    }
    public String getModelNo(){  // goo challenges / getterTest used this file
         return modelNo;
    }
}


