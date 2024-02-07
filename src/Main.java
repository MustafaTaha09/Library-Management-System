import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    static Scanner in;
    static Database db;

    public static void main(String[] args) {
        db = new Database();
        System.out.println("Welcome to our Library!");
        in = new Scanner(System.in);
        int input;
        do{
            System.out.println("0. Exit\n" +
                    "1. Login \n" +
                    "2. Sign up");
            input = in.nextInt();
            switch (input){
                case 0:
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
                default:
                    System.out.println("Error choosing from the options!");
            }

        }while (input != 0);


    }

    private static void login(){
        System.out.println("Enter your phone number: ");
        String phoneNum = in.next();
        System.out.println("Enter your email: ");
        String email = in.next();

        int idx = db.loginValidation(email, phoneNum);
        if(idx != -1){
            System.out.println("Login validated!\n" +
                    "Welcome Back " + db.getUser(idx).getName());
            db.getUser(idx).menu(db);
        }else {
            System.out.println("Login failed!");

        }



    }

    private static void newUser() {
        System.out.println("Enter your name: ");
        String name = in.next();
        System.out.println("Enter your phone number: ");
        String phoneNum = in.next();
        System.out.println("Enter your email: ");
        String email = in.next();
        System.out.println("Enter your role:\n" +
                "1) Admin\n" +
                "2) User");
        int role = in.nextInt();
        User user;
        if(role == 1){
            user = new Admin(name,email,phoneNum); // Reference type of the parent to accept any kind of users (children)
            db.addUser(user);
            System.out.println("Admin: " + name + " has been Registered!");
        }else if(role == 2){
            user = new NormalUser(name, email, phoneNum);  // Reference type of the parent to accept any kind of users (children)
            db.addUser(user);
            System.out.println("NormalUser: " + name + " has been Registered!");
        }else{
            System.out.println("Error Choice, either pick 1 or 2");
        }


    }

}