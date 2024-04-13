package day10.question11;

public class Book extends Item{
    int pages;
    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
    public String toString() {
        return "Book[" + " title = " + title + ", year = " + year + ", pages = " + pages + "]";
    }
}
