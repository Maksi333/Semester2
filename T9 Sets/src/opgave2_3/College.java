package opgave2_3;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class College {
    private String name;
    private LinkedHashMap<Integer,Student> students = new LinkedHashMap<>();

    public College(String name){
        this.name = name;
    }

    public void addStudent(Student student){
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double calcAverage(){
        double average = 0;
        int counter = 0;
        for(Student student : students.values()){
            for(int grade : student.getGrades()){
                average += grade;
                counter++;
            }
        }
        return average/counter;
    }

    public Student findStudent(int studentNo){
        Student foundStudent = null;

        for(Student student : students.values()) {
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
