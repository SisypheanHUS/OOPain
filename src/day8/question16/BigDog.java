package day8.question16;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Wooof");
    }
    public void greets(Dog another){
        System.out.println("Wooooow");
    }
    public void greets(BigDog another){
        System.out.println("Wooooooooooooooow");
    }
}
