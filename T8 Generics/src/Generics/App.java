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

        Person<FullName> poul = new Person<>(new FullName("poul", "Adamsen"));
        Person<FullName> lisa = new Person<>(new FullName("Lisa", "Petersen"));
        list.add(lisa);

        FullName pukl = new FullName("Hello", "hi");
        FullName pill = new FullName("Hello", "Adam");

        System.out.println(pukl.compareTo(pill));
        System.out.println(pill.compareTo(pukl));
        Collections.sort(list);
        System.out.println(list);

    }
}
