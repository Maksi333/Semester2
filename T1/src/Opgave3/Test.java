package Opgave3;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Emplyee> emplyees = new ArrayList<>();

        Mechanic per = new Mechanic("Per", "Svalevej", 2019, 10);
        emplyees.add(per);
        Mechanic poul = new Mechanic("Poul","Svanevej", 2015, 12);
        emplyees.add(poul);
        Foreman lisa = new Foreman("Lisa", "BobStreet", 2015, 15, 20, 2022);
        emplyees.add(lisa);
        Survoyer bob = new Survoyer("Bob", "Blubvej", 2010, 20, 10);
        emplyees.add(bob);
        WorkingBoy ninjaEmil = new WorkingBoy(25,"Ninja-Emil Hedegaard Larsen Gertrudson", "Bobehandlingen", 30);
        emplyees.add(ninjaEmil);


        System.out.println(totalWeeklySalary(emplyees));

    }

    public static double totalWeeklySalary(ArrayList<Emplyee> mechanics){
        double totalSalaryForOneWeek = 0;
        for(int i = 0; i < mechanics.size(); i++){
            totalSalaryForOneWeek += mechanics.get(i).weeklySalary();
        }
        return totalSalaryForOneWeek;
    }

     
}
