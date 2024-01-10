package opgave3;

import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

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
        for(int i = 0; i < students.size(); i++){
            for(int j = 0; j < students.get(i).getGrades().size(); j++){
                average += students.get(i).getGrades().get(j);
                counter++;
            }
        }
        return average/counter;
    }
//does not work
    /*
    public Student findStudent(int studentNo){
        Student foundStudent = null;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStudentNo() == studentNo){
                foundStudent = students.get(i);
                return foundStudent;
            }else{
                return null;
            }
        }
        return null;
    }

     */

    public Student findStudentForEachLoop(int studentNo){
        for(Student student : students){
            if(student.getStudentNo() == studentNo){
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
