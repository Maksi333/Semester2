package Geometriske;

public abstract class Geofigur {
    double x;
    double y;
    String name;

    Geofigur (double x, double y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public abstract double calculateArea();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
