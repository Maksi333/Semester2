package opgave1;

public class Main {


    public static Measurable[] chiliListe = new Measurable[5];
    public static Measurable[] ølListe = new Measurable[3];
    public static void main(String[] args) {
        Chili chili1 = new Chili("rat", 10);
        Chili chili2 = new Chili("mouse", 10000);
        Chili chili3 = new Chili("Deer", 5000);
        Chili chili4 = new Chili("Host", 2000);
        Chili chili5 = new Chili("Krølle", 9999);
        Beer øl1 = new Beer("Pepsi", 10);
        Beer øl2 = new Beer("Cola", 21);
        Beer øl3 = new Beer("Gin", 42);
        chiliListe[0] = chili1;
        chiliListe[1] = chili2;
        chiliListe[2] = chili3;
        chiliListe[3] = chili4;
        chiliListe[4] = chili5;
        ølListe[0] = øl1;
        ølListe[1] = øl2;
        ølListe[2] = øl3;


        System.out.println(average(chiliListe));
        System.out.println(max(chiliListe));
        System.out.println(max(ølListe));
        blackFridaymeal(chiliListe, ølListe);



    }

    public static double average(Measurable[] objects){
        double avg = 0;
        for(int i = 0; i < objects.length; i++){
            avg += objects[i].getMeasure();
        }
        return avg/objects.length;
    }

    public static Measurable max(Measurable[] objects){
        Measurable max = objects[0];
        for(int i = 0; i < objects.length; i++){
            if(max.getMeasure() < objects[i].getMeasure()){
                max = objects[i];
            }
        }
        return max;

    }

    public static Measurable[] blackFridaymeal(Measurable[] chilies, Measurable[] beers){
        Measurable[] blackFridayDeal = new Measurable[2];
        Measurable maxBeer = max(beers);
        Measurable maxChili = max(chilies);

        blackFridayDeal[0] = maxBeer;
        blackFridayDeal[1] = maxChili;

        System.out.println("this years blackfriday meal is " +maxChili + " and " + maxBeer);
        return blackFridayDeal;
    }

}