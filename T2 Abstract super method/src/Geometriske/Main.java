package Geometriske;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Geofigur> geofigurs = new ArrayList<>();
        Circle circle = new Circle(2,2,2,"Circle");
        geofigurs.add(circle);
        Square square = new Square(2,4,2,2,"Rektangel");
        geofigurs.add(square);
        Square Kvadrat = new Square(4,4,2,2,"Kvadrat");
        geofigurs.add(Kvadrat);
        Ellipse ellipse = new Ellipse(2,4,2,2,"Ellipse");
        geofigurs.add(ellipse);

        for(int i = 0; i < geofigurs.size(); i++){
            System.out.println(geofigurs.get(i).calculateArea());
            geofigurs.get(i).setX(geofigurs.get(i).getX() + 4);
            geofigurs.get(i).setY(geofigurs.get(i).getY()+3);

        }

    }
}
