import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<User> users;
    private ArrayList<String> userNames;
    private ArrayList<Book> books;
    Scanner in = new Scanner(System.in);



    public Database() {
        users = new ArrayList<>();
        userNames = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addUser(User s){
        users.add(s);
        userNames.add(s.getName());

    }

    public int loginValidation(String email, String phoneNum){
        int n = -1;
        for(User u : users){
            if(phoneNum.equals(u.getPhoneNumber()) && email.equalsIgnoreCase(u.getEmail()))
                    n = users.indexOf(u);
        }
        return n;
    }
    public void addBook() {
        String name, author, status;
        int qtySale, qtyBorrow;
        double price;
        System.out.println("Enter the name of the book: ");
        name = in.nextLine();
        System.out.println("Enter the author of the book: ");
        author = in.nextLine();
        System.out.println("Enter the status of the book: ");
        status = in.next();

        System.out.println("enter quantity for sale: ");
        qtySale = in.nextInt();

        System.out.println("enter quantity for borrow: ");
        qtyBorrow = in.nextInt();

        System.out.println("Enter Price: ");
        price = in.nextDouble();

        Book b = new Book(name, author, status, qtySale, price, qtyBorrow);
        this.getBooks().add(b);
        System.out.println("book " + name + " has been added!");

    }
    public User getUser(int n){
        return users.get(n);
    }
    public Database(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
