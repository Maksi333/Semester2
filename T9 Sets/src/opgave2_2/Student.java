package opgave2_2;

import java.util.ArrayList;

public class Student {

    private int studentNo;
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    private College college;

    public Student(int studentNo, String name){
        this.studentNo = studentNo;
        this.name = name;

    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
