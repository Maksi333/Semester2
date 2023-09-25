package opgave2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentNo;
    private List<Integer> grades = new ArrayList<>();

public Student(String name, int studentNo, List<Integer> grades){
    this.name = name;
    this.studentNo = studentNo;
    this.grades = grades;
}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNo=" + studentNo +
                ", grades=" + grades +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public List<Integer> getGrades() {
        return grades;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
}
