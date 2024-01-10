package Geometriske;

public class Ellipse extends Geofigur {
    double radius1;
    double radius2;

    Ellipse(double radius1, double radius2, double x, double y, String name){
        super(x,y,name);
        this.radius1 = radius1;
        this.radius2 = radius2;

    }
    public double calculateArea(){
        double area = 0;
        area = Math.PI*radius1*radius2;

        return area;
    }
}
