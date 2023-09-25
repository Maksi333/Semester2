package opgave2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class app {
    public static void main(String[] args) {
        College2 mofo = new College2("Mofo College");

        List<Integer> janGrades = new ArrayList<>();
        janGrades.add(10);
        janGrades.add(12);
        janGrades.add(7);
        janGrades.add(4);
        List<Integer> henrikGrades = new ArrayList<>();
        henrikGrades.add(10);
        henrikGrades.add(4);
        henrikGrades.add(02);
        henrikGrades.add(00);
        List<Integer> jakkaGrades = new ArrayList<>();
        jakkaGrades.add(7);
        jakkaGrades.add(4);
        jakkaGrades.add(02);
        jakkaGrades.add(10);

        Student per = new Student("Per", 1, janGrades);
        Student lise = new Student("Lise", 2, henrikGrades);
        Student lucas = new Student("Lucas", 3, jakkaGrades);

        mofo.addStudent(per);
        mofo.addStudent(lise);
        mofo.addStudent(lucas);


        System.out.println(mofo.findStudent(2));
        //System.out.println(mofo.calcAverageUsingForEach());
        //System.out.println(mofo.findStudent(3));
        //System.out.println(mofo.findStudentHashMap(1));


    }
}
