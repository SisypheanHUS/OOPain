package day8.question17;

public class BigDog extends Dog{
    @Override
    public void greeting(){
        System.out.println("Wooof");
    }
    @Override
    public void greeting(Dog another){
        System.out.println("Wooooow");
    }
}
