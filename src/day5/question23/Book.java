package day5.question23;

public class Book {
    private String name;
    private String isbn;
    private Author author;
    private double price;
    private int qty;

    public Book(String isbn,String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public Book(String isbn,String name, Author author, double price, int qty) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return isbn;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ", name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }
}
