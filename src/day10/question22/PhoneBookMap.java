package day10.question22;
import java.util.HashMap;
import day10.question11.Student;

public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;
    public PhoneBookMap(){
        phoneBook = new HashMap<>();
    }
    public void addPerson(Student student){
        phoneBook.put(student.getNumber(), student);
    }
    public Student searchByName(String name){
        for (Student student : phoneBook.values()) {
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
    public Student searchByNumber(String number){
        return phoneBook.get(number);
    }
    public void deleteByNumber(String number){
        phoneBook.remove(number);
    }
    public Student searchBylastName(String lastName){
        for (Student student : phoneBook.values()) {
            if(student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }
}
