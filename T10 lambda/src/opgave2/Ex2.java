package opgave2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        System.out.println(runners);
        System.out.println();


            runners.forEach(runner -> {
            System.out.println("Name: " + runner.getName() + " " + "Laptime: " + runner.getLapTime() );
        });

        runners.forEach(runner -> {
            if(runner.getLapTime() < 30) {
                System.out.println("Name: " + runner.getName() + " " + "Laptime: " + runner.getLapTime());
            }
        });

        runners.sort(Comparator.comparingInt(Runner::getLapTime));
        System.out.println(runners);
        runners.sort((runner1, runner2) -> Integer.compare(runner1.getLapTime(), runner2.getLapTime()));

    }
}