package day7.question15;

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
    @Override
    public String toString() {
        return "Dog["+super.toString()+"]]]";
    }
}
