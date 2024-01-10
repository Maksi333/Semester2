package opgave2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        //System.out.println(runners);
        System.out.println();

        runners.forEach(runner -> System.out.println("name: " + runner.getName() +"LapTime: " + runner.getLapTime()));
        System.out.println("Space");
        System.out.println(" ");

        runners.stream().filter(runner -> runner.getLapTime() < 30).forEach(runner -> System.out.println("Name: " + runner.getName() + "Laptime: " + runner.getLapTime()));
        runners.sort(Comparator.comparing(runner -> runner.getLapTime()));

        System.out.println("Space");
        System.out.println(runners);
    }

}