package Generics;
public class Person <T extends Comparable<T>> implements Comparable<Person<T>>{

    private T name;


    public Person(T name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                '}';
    }



    public T getName() {
        return name;
    }

    @Override
    public int compareTo(Person<T> p) {
        return name.compareTo(p.getName());
    }

}
