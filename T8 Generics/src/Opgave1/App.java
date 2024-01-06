package Opgave1;

import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {


        FullName bobFullName = new FullName("Bob", "Vance");
        FullName adamFullName = new FullName("Adam", "Bobson");
        FullName sallyFullName = new FullName("Sally", "Hobson");
        FullName chrisFullName = new FullName("Chris", "Tobson");

        Person<FullName> bobFull = new Person<>(bobFullName, 35);
        Person<FullName> adamFull = new Person<>(adamFullName, 30);
        Person<FullName> sallyFull = new Person<>(sallyFullName, 12);
        Person<FullName> chrisFull = new Person<>(chrisFullName,90);

        ArrayList<Person<FullName>> list = new ArrayList<>();
        list.add(bobFull);
        list.add(sallyFull);
        list.add(adamFull);
        list.add(chrisFull);



       // System.out.println(adam.compareTo(bob));
        //System.out.println(bob.compareTo(adam));
        //System.out.println(adamFullName.compareTo(bobFullName));
        for(Person person : list ){
            System.out.println(person);
        }
        //sort by name;
            //Collections.sort(list);

        // sort by age
        list.sort(Comparator.comparingInt(Person::getAge));
        for(Person person : list){
            System.out.println(person);
        }
    }
}
