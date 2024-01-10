package opgave1;

import java.util.Arrays;

public class App {
    private static Mesurable[] chilies = new Mesurable[3];
    private static Mesurable[] beers = new Mesurable[3];
    public static void main(String[] args) {
        Mesurable chili = new Chili("Carolina Reaper", 100000);
        chilies[0] = chili;
        Mesurable chili2 = new Chili("Jalapeno", 4000);
        chilies[1] = chili2;
        Mesurable chili3 =  new Chili("Habanero", 50000);
        chilies[2] = chili3;
        Mesurable beer = new Beer("Harboe", 5);
        beers[0] = beer;
        Mesurable beer2 = new Beer("Svaneke", 8);
        beers[1] = beer2;
        Mesurable beer3 = new Beer("Black ale", 26);
        beers[2] = beer3;

        Filter filter = new Filter5000();

        System.out.println(average(chilies));
        System.out.println(max(chilies));
        System.out.println(Arrays.toString(blackFridayMeal(chilies, beers)));
        System.out.println(averageMedFilter(chilies, filter));

    }

    public static double average(Mesurable[] objects){
        double average = 0;
        for(int i = 0; i < objects.length; i++){
            average += objects[i].getmesurable();
        }
        return average / objects.length;
    }


    public static double averageMedFilter(Mesurable[] objects, Filter filter) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < objects.length; i++){
            if(filter.accept(objects[i])){
                sum += chilies[i].getmesurable();
                count++;
            }
        }
        return sum / count;
    }

    public static Mesurable max(Mesurable[] objects){
        int max = 0;
        for(int i = 0; i < objects.length; i++){
            if(objects[i].getmesurable() > objects[max].getmesurable()){
                max = i;
            }
        }
        return objects[max];
    }

    public static Mesurable[] blackFridayMeal(Mesurable[] chilies, Mesurable[] beer){
        Mesurable[] meal = new Mesurable[2];
        meal[0] = max(chilies);
        meal[1] = max(beer);

        return meal;
    }

}
