package opgave1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Filter;

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

       Person p44 = findFirst(persons, p -> p.getAge() == 44);
        System.out.println("age 44" + p44);


        Person sNames = findFirst(persons, (Person p) -> p.getName().startsWith("S"));
        System.out.println(sNames);

        Person containsI = findFirst(persons,(Person p) -> p.getName().contains("i"));
        System.out.println(containsI);


        Person ageToName = findFirst(persons, (Person p) -> p.getAge() == p.getName().length());
        System.out.println(ageToName);

        System.out.println(findAll(persons));
        System.out.println(findAll2(persons, (Person p) -> p.getAge() < 30));
        System.out.println(findAll2(persons, (Person p) -> p.getName().contains("i")));
        System.out.println(findAll2(persons,(Person p) -> p.getName().startsWith("S")));
        System.out.println(findAll2(persons,(Person p) -> p.getName().length() == 5));
        System.out.println(findAll2(persons, (Person p) -> p.getName().length() > 5 && p.getAge() < 40));



    }

    public static List<Person> findAll2(List<Person> persons, Predicate<Person> filter){
        List<Person> pplunder302 = new ArrayList<>();
        for(Person p : persons){
            if(filter.test(p)){
                pplunder302.add(p);
            }
        }
        return pplunder302;
    }

    public static List<Person> findAll(List<Person> persons){
        List<Person> pplunder30 = new ArrayList<>();
        for(Person p : persons){
            if(p.getAge() < 30){
                pplunder30.add(p);
            }
        }
        return pplunder30;
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
}
