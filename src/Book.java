import java.util.Scanner;

public class Book {
    private String name;
    private String author;
    private String status;
    private int qtySale;
    private double price;
    private int qtyBorrow;

    Scanner in = new Scanner(System.in);
    public Book(){}
    public Book(String name, String author, String status, int qtySale, double price, int qtyBorrow) {
        this.name = name;
        this.author = author;
        this.status = status;
        this.qtySale = qtySale;
        this.price = price;
        this.qtyBorrow = qtyBorrow;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQtySale() {
        return qtySale;
    }

    public void setQtySale(int qtySale) {
        this.qtySale = qtySale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyBorrow() {
        return qtyBorrow;
    }

    public void setQtyBorrow(int qtyBorrow) {
        this.qtyBorrow = qtyBorrow;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                ", qtySale=" + qtySale +
                ", price=" + price +
                ", qtyBorrow=" + qtyBorrow +
                '}';
    }
}
