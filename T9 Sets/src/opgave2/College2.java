package opgave2;

import java.util.*;

public class College2 {
    private String name;
    private Map<Integer,Student> students = new LinkedHashMap<Integer,Student>();

    public College2(String name) {
        this.name = name;
        this.students = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calcAverage() {
        int totalSum = 0;
        int totalCount = 0;
        for (int i = 0; i < students.size(); i++) {
            List<Integer> grades = students.get(i).getGrades();
            for (int j = 0; j < grades.size(); j++) {
                totalSum += grades.get(j);
                totalCount++;
            }
        }
        return totalSum / totalCount;
    }


    public Student findStudent(int studentNo) {
        for (int i = 0; i < students.size(); i++) {
            Student currentstudent = students.get(i);
            if(currentstudent.getStudentNo() == studentNo) {
                return currentstudent;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}