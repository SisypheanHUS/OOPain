package day6;

public class MyDate {
    int year;
    int month;
    int day;
    String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int[] DAYSINMONTH = {31,28,31,30,31,30,31,31,30,31,30,31};
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public String toString(){
    if (!isValidDate(this.year, this.month, this.day)) {
        return "The date is not valid.";
    }
    return String.format("%s %d,%s, %d", DAYS[getDayOfWeek(this.year, this.month, this.day)], this.day, MONTHS[this.month - 1], this.year);
}
    public boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public boolean isValidDate(int year, int month, int day){
        if(year < 1 || year > 9999){
            return false;
        }
        if(month < 1 || month > 12){
            return false;
        }
        if(day < 1 || day > 31){
            return false;
        }
        if(month == 2){
            if(isLeapYear(year)){
                if(day > 29){
                    return false;
                }
            } else {
                if(day > 28){
                    return false;
                }
            }
        }
        if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 30){
                return false;
            }
        }
        return true;
    }
    public int getDayOfWeek(int year, int month, int day) {
        int[] commonYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYear =   {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        int res = 0;
        if(isLeapYear(year)) {
            res = (day + leapYear[month - 1] + 5 * ((year - 1) % 4) + 4 * (year - 1) % 100 + 6 * ((year - 1) % 400)) % 7;
        } else {
            res = (day + commonYear[month - 1] + 5 * ((year - 1) % 4) + 4 * (year - 1) % 100 + 6 * ((year - 1) % 400)) % 7;
        }
        return res;
    }

    public MyDate nextDay(){
        int d = this.day;
        int m = this.month;
        int y = this.year;
        if(isValidDate(y, m, d + 1)){
            this.day++;
        } else {
            if(isValidDate(y, m + 1, 1)){
                this.month++;
                this.day = 1;
            } else {
                this.year++;
                this.month = 1;
                this.day = 1;
            }
        }
        return this;
    }
    public MyDate nextMonth(){
        int d = this.day;
        int m = this.month;
        int y = this.year;
        if(isValidDate(y, m + 1, d)){
            this.month++;
        } else {
            this.year++;
            this.month = 1;
        }
        return this;
    }
    public MyDate nextYear(){
        int d = this.day;
        int m = this.month;
        int y = this.year;
        this.year++;
        return this;
    }
    public MyDate previousDay() {
    if (this.day == 1 && this.month == 1) {
        this.day = 31;
        this.month = 12;
        this.year--;
    } else if (this.day == 1) {
        this.month--;
        this.day = DAYSINMONTH[this.month - 1];
    } else {
        this.day--;
    }
    return this;
    }
    public MyDate previousMonth(){
    if (this.month == 1) {
        this.month = 12;
        this.year--;
    } else {
        this.month--;
    }
    int maxDayInMonth = DAYSINMONTH[this.month - 1];
    if (this.day > maxDayInMonth) {
        this.day = maxDayInMonth;
    }
    return this;
    }
    public MyDate previousYear(){
    this.year--;
    if (this.month == 2 && this.day == 29 && !isLeapYear(this.year)) {
        this.day = 28;
    }
    return this;
}

}
