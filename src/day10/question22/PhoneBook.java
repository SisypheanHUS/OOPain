package day10.question22;
import day10.question11.Student;

public interface PhoneBook {
    public Student searchByName(String name);
    public Student searchBylastName(String lastName);
    public Student searchByNumber(String number);
    public void addPerson(Student student);
    public void deleteByNumber(String number);
}
