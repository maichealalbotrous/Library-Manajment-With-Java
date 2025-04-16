import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static Database Database = new Database();

    public static void main(String[] args) throws Exception {

        int chois;
        do {

            System.out.println("1:To Add New User");
            System.out.println("2: To Login");
            System.out.println("3:To Exite");

            chois = in.nextInt();

            switch (chois) {

                case 1:
                    Adduser();
                    break;
                case 2:
                    login();
                    break;

                default:
                    System.out.println("Error");
                    break;
            }

        } while (chois != 3);
    }

    // ==Adduser
    // METHOD=======================================================================================
    // ===========================================================================================
    static public void Adduser() {
        System.out.println("please enter the Name");
        String Name = in.nextLine();
        in.nextLine();
        System.out.println("please enter the Phone number");
        String Number = in.nextLine();
        System.out.println("please enter the Email");
        String Email = in.nextLine();
        System.out.println("please (1) To Add NormalUsernpress" + "\n" + " (2) To Add Admin");
        int usertype = in.nextInt();
        in.nextLine();

        if (usertype == 1) {
            NormalUs normalUser = new NormalUs(Name, Number, Email);
            Database.Adduser(normalUser);
            normalUser.Menu(Database, normalUser);
        } else {
            AdminUser adminUser = new AdminUser(Name, Number, Email);
            Database.Adduser(adminUser);
            adminUser.Menu(Database, adminUser);
        }

        System.out.println("The user created");
    }

    // ==LOGIN
    // METHOD=======================================================================================
    // ===========================================================================================
    static public void login() {
        System.out.println("pleas enter the Phone number");
        String Number = in.next();
        System.out.println("pleas enter the Email");
        String Email = in.next();
        int n = Database.Login(Email, Number);
        if (n != -1) {
            Users users = Database.getuser(n);
            users.Menu(Database, users);
        } else {
            System.out.println("The user not foutd");
        }

    }

}
