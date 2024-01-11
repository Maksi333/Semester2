package Generics;


import java.sql.SQLOutput;

public class FullName implements Comparable<FullName>{

    private String firstName;
    private String lastName;


    public FullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(FullName n) {
        int compared = this.firstName.compareTo(n.getFirstName());
        if(compared > 0){
            System.out.println(this.firstName);
        }if(compared < 0){
            System.out.println(n.firstName);
        }
        if(compared == 0) {
            compared = this.getLastName().compareTo(n.getLastName());
            if(compared > 0){
                System.out.println(this.lastName);
            }else{
                System.out.println(n.lastName);
            }
        }
        return compared;
    }


}
