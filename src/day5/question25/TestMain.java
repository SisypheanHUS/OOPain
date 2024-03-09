package day5.question25;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "John", 'M');
        Account a1 = new Account(1, c1, 1000);
        System.out.println(a1);
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw(1000);
        System.out.println(a1);
        a1.withdraw(500);
        System.out.println(a1);
    }
}
