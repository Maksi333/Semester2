package opgave2_2;

public class app {
    public static void main(String[] args) {
        College college = new College("Collllleege");

        Student paul = new Student(1,"Paul");
        Student susan = new Student(2,"Susan");
        Student peter = new Student(3, "Peter");

        college.addStudent(paul);
        college.addStudent(susan);
        college.addStudent(peter);

        paul.addGrade(2);
        paul.addGrade(7);
        paul.addGrade(10);
        susan.addGrade(7);
        susan.addGrade(10);
        susan.addGrade(12);
        peter.addGrade(12);
        peter.addGrade(12);
        peter.addGrade(12);

        System.out.println(college.calcAverage());
        System.out.println(college.findStudent(3));
    }
}
