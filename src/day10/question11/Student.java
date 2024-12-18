package day10.question11;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    String lastname;
    String phone;
    double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastname;
    }
    public String getNumber(){
        return phone;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s){
        if(this.name.compareTo(s.name)==0){
            return this.lastname.compareTo((s.lastname));
        }
        return this.name.compareTo(s.name);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Student student = (Student) o;
        return Double.compare(student.average, average) == 0 && Objects.equals(name, student.name) && Objects.equals(lastname, student.lastname) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, lastname, phone, average);
    }
    @Override
    public String toString(){
        return "Student[" + " name = " + name + ", lastname = " + lastname + ", phone = " + phone + ", average = " + average + "]";
    }
}
