package Geometriske;

public class Circle extends Geofigur {
    double radius;


    Circle(double radius, double x, double y, String name){
        super(x,y, name);
        this.y = y;
        this.x = x;
        this.radius = radius;
    }
    public double calculateArea(){
        double area = 0;
        area = Math.PI*radius*radius;

        return area;
    }
}
