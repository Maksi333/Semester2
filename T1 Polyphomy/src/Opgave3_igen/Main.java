package Opgave3_igen;

import java.util.ArrayList;

import static Opgave3.Test.totalWeeklySalary;

public class Main {
    private static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        Person mechanic = new Mechanic("Bob", "Bobst", 10, 2014);
        Person foreman = new Foreman("Bib", "Bibstr", 15, 10, 2011);

        persons.add(mechanic);
        persons.add(foreman);

        System.out.println(totalWeeklySalary());
    }

    public static double totalWeeklySalary(){
        double totalSalary = 0;
        for(int i = 0; i < persons.size(); i++){
            totalSalary = persons.get(i).weeklySalary();
        }
        return totalSalary;
    }
}
