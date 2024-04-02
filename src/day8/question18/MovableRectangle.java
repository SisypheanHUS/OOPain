package day8.question18;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "Rectangle at (" + topLeft.x + ", " + topLeft.y + ") and (" + bottomRight.x + ", " + bottomRight.y + ")";
    }

    @Override
    public void moveUp(){
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown(){
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft(){
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight(){
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    //1.Default Implementation: An abstract class can have a default implementation of methods (both abstract and non-abstract methods),
    //    while an interface cannot have an implementation of methods until Java 8. From Java 8 onwards,
    //    interfaces can have default and static methods.
    //    2.Multiple Inheritance: A class can implement multiple interfaces, but it can extend only one abstract class.
    //    3.Access Modifiers: All methods in an interface are implicitly public and abstract.
    //    An abstract class can have methods with any access modifier (public, private, protected) and they can also be static, final, or abstract.
    //    4.Fields: An interface can only have static and final fields (constants), while an abstract class can have non-final and non-static fields.
    //    5.Constructor: An abstract class can have a constructor, while an interface cannot.
}
