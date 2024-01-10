package opgave1;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        System.out.println(persons);
        System.out.println();

        Optional<Person> personWithAge44 = persons.stream().filter(person -> person.getAge() == 44).findFirst();
        System.out.println(personWithAge44);

        Optional<Person> personStartingS = persons.stream().filter(person -> person.getName().startsWith("S")).findFirst();
        System.out.println(personStartingS);

        Predicate<Person> nameWithMultipleIPredicate = person -> person.getName().chars().filter(ch -> ch == 'i').count() > 1;
        Person persontestI = findFirst(persons,nameWithMultipleIPredicate);
        printResult("Here: ", persontestI);

        Predicate<Person> personStartingWithS = person -> person.getName().startsWith("S");
        Person persontestS = findFirst(persons, personStartingWithS);
        System.out.println(personStartingS);

        Predicate<Person> personWith5Letters = person -> person.getName().chars().count() == 5;
        Person person5Letter = findFirst(persons, personWith5Letters);
        System.out.println(person5Letter);

        Predicate<Person> personWithAgeBetween = person -> person.getAge() > 6 && person.getAge() < 40;
        Person personAgeBetween = findFirst(persons, personWithAgeBetween);
        System.out.println(personAgeBetween);

        Predicate<Person> personWithAgeBetweenall = person -> person.getAge() > 6&& person.getAge() < 40;
        ArrayList<Person> printAll = findAll(persons,personWithAgeBetweenall);
        System.out.println(printAll);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }
    public static void printResult(String message, Person person) {
        if (person != null) {
            System.out.println(message + ": " + person.getName());
        } else {
            System.out.println(message + ": No person found.");
        }
    }

    public static ArrayList<Person> findAll(List<Person> list, Predicate<Person> filter){
        ArrayList<Person> result = new ArrayList<>();
        for(Person person : list){
            if(filter.test(person)){
                result.add(person);
            }
        }
        if(result.isEmpty()){
            System.out.println("No person found");
        }
        return result;
    }
}
