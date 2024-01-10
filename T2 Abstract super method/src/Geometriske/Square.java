package Geometriske;

public class Square extends Geofigur {
    double length;
    double height;

    Square(double length, double height, double x, double y, String name){
        super(x,y,name);
        this.length = length;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        double area = 0;
        area = length * height;

        return area;
    }

}
