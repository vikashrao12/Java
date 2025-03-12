package Numbers;

public class circle {

    double radiusInMm;
    circle(double radiusInMm){
        this.radiusInMm = radiusInMm;

    }

    double getCircumference(){
        return 2 * radiusInMm * Math.PI;
    }

    double area(){
        return Math.PI * Math.pow(radiusInMm , 2);
    }

    @Override
    public String toString() {
        return "Circle props : Radius : " + radiusInMm+", Circumference "
                + getCircumference() + ", Area  " + area() ;
    }

    public static void main(String[] args) {

        circle st = new circle(5);
        System.out.println(st);

    }
}
