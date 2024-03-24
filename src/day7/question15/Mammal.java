package day7.question15;

import day7.question15.Animal;

public class Mammal extends Animal {
    public Mammal(String name){
        super(name);
    }
    public String toString(){
        return "Mammal[" + super.toString() + "]]";
    }
}
