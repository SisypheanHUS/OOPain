package day10.question21;

public class TestApp {
    public static void main(String[] args) {
        MyList l = new MyArrayList();
        l.add("a",0);
        l.add("b");
        l.add("c",0);
        l.add("c",3);
        System.out.println(l.size());
        System.out.println(l);
    }
}
