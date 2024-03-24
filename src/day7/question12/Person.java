package day7.question12;

public class Person {
    String name;
    String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    @Override
    public String toString(){
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }

}
