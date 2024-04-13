package day10.question22;

import day10.question11.Student;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();
        pb.addPerson(new Student("Nicola","Bicocchi","34567"));
        pb.addPerson(new Student("Marco","Rizzo","45243"));
        pb.addPerson(new Student("Luisa","Poppi","24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchBylastName("Poppi"));
        System.out.println(pb.searchByNumber("1111"));
        pb.deleteByNumber("24564");
        System.out.println(pb.searchBylastName("Poppi"));
    }
}
