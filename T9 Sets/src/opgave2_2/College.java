package opgave2_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class College {
    private String name;
    private LinkedHashSet<Student> students = new LinkedHashSet<>();

    public College(String name){
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double calcAverage(){
        double average = 0;
        int counter = 0;
        for(Student student : students){
            for(int grade : student.getGrades()){
                average += grade;
                counter++;
            }
        }
        return average/counter;
    }

    public Student findStudent(int studentNo){
        Student foundStudent = null;

        for(Student student : students) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                '}';
    }
}
