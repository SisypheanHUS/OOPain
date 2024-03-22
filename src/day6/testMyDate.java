package day6;

public class testMyDate {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2012,2, 28);
        System.out.println(myDate);
        System.out.println(myDate.nextDay());
        System.out.println(myDate.nextDay());
        System.out.println(myDate.nextMonth());
        System.out.println(myDate.nextYear());

        MyDate myDate2 = new MyDate(2012,1, 2);
        System.out.println(myDate2);
        System.out.println(myDate2.previousDay());
        System.out.println(myDate2.previousDay());
        System.out.println(myDate2.previousMonth());
        System.out.println(myDate2.previousYear());

        MyDate myDate3 = new MyDate(2012,2, 29);
        System.out.println(myDate3.previousYear());

        MyDate myDate4 = new MyDate(2099,11, 31);
        System.out.println(myDate4);
        MyDate myDate5 = new MyDate(2011,2,29);
        System.out.println(myDate5);

        MyDate myDate6 = new MyDate(2012,4,1);
        System.out.println(myDate6);
        System.out.println(myDate6.nextYear());

    }



}
