package opgave2;

import java.util.*;

public class College {
    private Map<Integer,Student> studentlist = new LinkedHashMap<Integer, Student>();

    private String name;

    public College(String name){
        this.name = name;
        this.studentlist = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }
    public void addStudent(Student student){
        studentlist.put(student.getStudentNo(),student);
    }
    public void removeStudent(Student student){
        studentlist.remove(student);
    }
// when using HashSet use foreach loop
    /*
    public double calcAverageUsingForEach(){
        double sum = 0;
        int totalcount = 0;
        for(Student s : studentlist){
            List<Integer> grades = s.getGrades();
            for(Integer e : grades){
                sum += e.intValue();
                totalcount++;
            }
        }
        return sum / totalcount;
    }

     */

    //using normal List use this
/*
    public double calcAverage(){
        double sum = 0;
        int totalcount = 0;
        for(int i = 0; i < studentlist.size(); i++){
            List<Integer> temparray = studentlist.get(i).getGrades();
            for(int j = 0; j < temparray.size(); j++){
                sum += temparray.get(j);
                totalcount++;
            }

        }
        return sum / totalcount;
    }

 */

    /*
    //Linkedset

    public Student findStudent(int studentNo){
        int index = 0;
        for(Student s : studentlist){
            if(studentNo == s.getStudentNo()){
                return s;
            }
        }
        return null;
    }

     */

    //find student using hashmap
    public Student findStudentHashMap(int studentNo){
        for(int i = 0; i < studentlist.size(); i++){
            Student currentStudent = studentlist.get(i);
            if(currentStudent.getStudentNo() == studentNo){
                return currentStudent;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "College{" +
                "studentlist=" + studentlist +
                ", name='" + name + '\'' +
                '}';
    }
}
