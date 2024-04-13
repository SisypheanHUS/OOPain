package day10.question22;
import java.util.ArrayList;
import day10.question11.Student;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;

    public PhoneBookList(){
        phoneBook = new ArrayList<>();
    }
    @Override
    public void addPerson(Student student){
        phoneBook.add(student);
    }
    @Override
    public Student searchByName(String name){
        for (Student student : phoneBook) {
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
    @Override
    public Student searchByNumber(String number){
        for (Student student : phoneBook) {
            if(student.getNumber().equals(number)){
                return student;
            }
        }
        return null;
    }
    @Override
    public void deleteByNumber(String number){
        for (int i = 0; i < phoneBook.size(); i++) {
            if(phoneBook.get(i).getNumber().equals(number)){
                phoneBook.remove(i);
                return;
            }
        }
    }
    @Override
    public Student searchBylastName(String lastName){
        for (Student student : phoneBook) {
            if(student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }
}
