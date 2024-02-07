import java.util.ArrayList;

public class NormalUser extends User {
    @Override
    void menu(Database db) { // Dynamic Binding Method (runtime binding)
        System.out.println("1. View books \n" +
                "2. Search\n" +
                "3. Place Order\n" +
                "4. Borrow book\n" +
                "5. Calculate Fine\n" +
                "6. Return Book\n" +
                "7. Exit");
    }

    public NormalUser(String name) {
        super(name);
    }

    public NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        books = new ArrayList<>();

    }
}
