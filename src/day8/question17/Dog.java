package day8.question17;

public class Dog extends Animal{
    @Override
    public void greeting(){
        System.out.println("Woof");
    }
    public void greeting(Dog another){
        System.out.println("Woooof");
    }
}
