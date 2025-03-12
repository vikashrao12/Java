package Numbers;

public class car {
    int noOfWheel;
    float maxSpeed;
    int npOfDoor;
    String name;
    String modelNumber;
    String company;

    public car(int noOfWheel, float maxSpeed, int npOfDoor, String name, String modelNumber, String company) {
        this.noOfWheel = noOfWheel;
        this.maxSpeed = maxSpeed;
        this.npOfDoor = npOfDoor;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "car{" +
                "noOfWheel=" + noOfWheel +
                ", maxSpeed=" + maxSpeed +
                ", npOfDoor=" + npOfDoor +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        car obj = new car(4,250,4,"swift","4551","maruti");
        System.out.println(obj);
    }
}
