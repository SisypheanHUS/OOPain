package day10.question11;

public class Dvd extends Item{
    int duration;
    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    public String toString() {
        return "Dvd[" + " title = " + title + ", year = " + year + ", duration = " + duration + "]";
    }
    public static void main(String[] args) {

    }
}
