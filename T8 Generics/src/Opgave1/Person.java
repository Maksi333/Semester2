package Opgave1;

public class Person <T extends Comparable<T>> implements Comparable<Person<T>>{

    private T name;
    private int age;

    public Person (T name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                age;
    }

    @Override
    public int compareTo(Person<T> o) {
        return this.name.compareTo(o.name);
    }

    public int getAge() {
        return age;
    }
}
