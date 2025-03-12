package AccessModifiers;

public class Car {
    public String color;
    public String modelNo;
    private double fuelLevel;
    private long cost;  // go to the AccessTest Class

    long speed;  //default Access Modifier

    Car(){

    }

    public Car(String color, String modelNo, double fuelLevel, long cost) {
        this.color = color;
        this.modelNo = modelNo;
        this.fuelLevel = fuelLevel;
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", modelNo='").append(modelNo).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
