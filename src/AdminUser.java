import java.util.Scanner;

public class AdminUser extends Users {

    public AdminUser(String name) {
        super(name);
        this.Ioopreation = new Ioopreation[] {
                new Viewbook(),
                new Addbook(),
                new DeletBook(),
                new search(),
                new DeletAllbook(),
                new viewOrder(),
                new Exite(),

        };
    }

    public AdminUser(String name, String email, String phonenumber) {
        super(name, email, phonenumber);
        this.Ioopreation = new Ioopreation[] {
                new Addbook(),
        };
    }

    @Override
    public void Menu(Database Database, Users User) {
        System.out.println("(1): view book");
        System.out.println("(2): add book");
        System.out.println("(3):Delet book");
        System.out.println("(4):Serch ");
        System.out.println("(5):Delet all book");
        System.out.println("(6):view order");
        System.out.println("(7):Exite");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        this.Ioopreation[n - 1].oper(Database, User);

    }
@Override
    public String Print() {
      return name + "<N/>" + email + "<N/>" + phonenumber + "<N/>" + "Admin";
    }

}
