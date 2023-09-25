package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static ArrayList<Person<FullName>> list = new ArrayList<>();
    public static void main(String[] args) {
        Person per = new Person("Per");
        FullName per2 = new FullName("Per", "Romson");
        Person perFullname = new Person(per2);
        list.add(perFullname);

        Person<FullName> lisa = new Person<>(new FullName("Lisa", "Petersen"));
        list.add(lisa);


        Collections.sort(list);
        System.out.println(list);

    }
}
