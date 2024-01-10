package opgave3;

import java.util.ArrayList;
import java.util.Scanner;

public class Indkøbsvogn {
    public ArrayList<Varer> vareIVognen = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Varer> lægIVognen(Varer vare){
        if(vare instanceof Fødevare){
            vare.setPris(vare.getPris() * 1.05);
        } else if(vare instanceof Elartikel){
            vare.setPris(vare.getPris() * 1.30);
        }else if(vare instanceof Spiritus){
            if(vare.getPris() > 90){
                vare.setPris(vare.getPris() * 2.2);
            }else{
                vare.setPris(vare.getPris()* 1.8);
            }
        }else{
            vare.setPris(vare.getPris()*1.25);
        }
        vareIVognen.add(vare);
        return vareIVognen;
    }


    public double totalPris(ArrayList<Varer> varers){
        double total = 0;
        for(int i = 0; i < varers.size(); i++){

            total += varers.get(i).getPris();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Indkøbsvogn{" +
                "vareIVognen=" + vareIVognen +
                '}';
    }
}
