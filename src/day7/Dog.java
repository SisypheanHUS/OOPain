package day7;

public class Dog {
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another) {
        System.out.println("Wooooof");
    }
    public String toString() {
        return "Dog["+super.toString()+"]]]";
    }
}
