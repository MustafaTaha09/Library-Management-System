import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    Scanner in = new Scanner(System.in);

    @Override
    void menu(Database db) { // Dynamic Binding Method (runtime binding)
        int choice;
        do {
            System.out.println("1. View books \n" +
                    "2. Add book\n" +
                    "3. Delete book\n" +
                    "4. Search\n" +
                    "5. Delete all data\n" +
                    "6. View Orders\n" +
                    "7. Exit");
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    viewAllBooks(db);
                    break;
                case 2:
                    db.addBook();
                    break;
                case 3:
                    DeleteBook(db);
                    break;
                case 4:
                    searchBook(db);
                    break;
            }
        } while (choice != 7);


    }

    public void searchBook(Database db) {
        String name;
        System.out.println("Enter name of the book you want to find: ");
        name = in.nextLine();
        int searchIdx = validateBook(name, db);
        if (searchIdx != -1) {
            Book b = db.getBooks().get(searchIdx);
            System.out.println("book: " + name + " Has been found!");
            System.out.println(b.toString());
        } else
            System.out.println("book " + name + " doesn't exist!");
    }


    public void DeleteBook(Database db) {
        System.out.println("Enter the name of the book u want to delete: ");
        String name = in.nextLine();
        int deleteIdx = validateBook(name, db);
        if (deleteIdx != -1) {
            db.getBooks().remove(deleteIdx);
            System.out.println("book: " + name + " Has been deleted!");
        } else
            System.out.println("book: " + name + " doesn't exist!");
    }

    private int validateBook(String name, Database db) {
        int idx = -1;
        for (Book b : db.getBooks()) {
            if (b.getName().equalsIgnoreCase(name)) {
                idx = db.getBooks().indexOf(b);
                return idx;
            }
        }
        return idx;
    }

    public void viewAllBooks(Database db) {
        if (db.getBooks().isEmpty()) {
            System.out.println("There are no books in the library!");
            return;
        }
        System.out.println("All books in the Library are: ");
        for (Book b : db.getBooks()) {
            System.out.println(b.toString());
        }
    }

    public Admin(String name) {
        super(name);
    }

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        books = new ArrayList<>();
    }
}

