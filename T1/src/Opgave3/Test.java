package Opgave3;

import java.util.ArrayList;

public class Test {
    private static ArrayList<Mechanic> mechanics = new ArrayList<>();

    public static void main(String[] args) {
        Mechanic per = new Mechanic("Per", "Svalevej", 2019, 13.4);
        mechanics.add(per);
        Mechanic poul = new Mechanic("Poul","Svanevej", 2015, 16.4);
        mechanics.add(poul);
        Foreman lisa = new Foreman("Lisa", "BobStreet", 2015, 45, 20, 2022);
        mechanics.add(lisa);
        Survoyer bob = new Survoyer("Bob", "Blubvej", 2010, 30, 10);
        mechanics.add(bob);

        System.out.println(totalWeeklySalary(mechanics));

    }

    public static double totalWeeklySalary(ArrayList<Mechanic> mechanics){
        double totalSalaryForOneWeek = 0;
        for(int i = 0; i < mechanics.size(); i++){
            totalSalaryForOneWeek += mechanics.get(i).weeklySalary(mechanics.get(i).getTimeLøn());
        }
        return totalSalaryForOneWeek;
    }
}
