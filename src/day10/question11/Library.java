package day10.question11;

public class Library {
    static Rent[] rents;
    public Library(Rent[] rents) {
        this.rents = rents;
    }
    public static Rent getLongestRent() {
        Rent longestRent = rents[0];
        for (int i = 1; i < rents.length; i++) {
            if (rents[i].end.getTime() - rents[i].begin.getTime() > longestRent.end.getTime() - longestRent.begin.getTime()) {
                longestRent = rents[i];
            }
        }
        return longestRent;
    }
}
