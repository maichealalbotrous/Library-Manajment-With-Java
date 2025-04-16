import java.util.Scanner;

public class NormalUs extends Users {

    public NormalUs(String name) {
        super(name);
        this.Ioopreation = new Ioopreation[] {
                new Viewbook(),
                new search(),
                new placeorder(),
                new Borrowbook(),
                new CalculateFine(),
                new ReturnBook(),
                new Addbook(),
                new placeorder(),
                new Exite(),
        };

    }

    public NormalUs(String name, String email, String phonenumber) {
        super(name, email, phonenumber);
        this.Ioopreation = new Ioopreation[] {
                new Addbook(),

        };
    }@Override
    public void Menu(Database Database, Users User) {
        System.out.println("(1): view book");
        System.out.println("(2): search");
        System.out.println("(3): place order");
        System.out.println("(4): Borrow book");
        System.out.println("(5): Calculate Fine");
        System.out.println("(6): return book");
        System.out.println("(7): Add book");
        System.out.println("(8): Add book");
        System.out.println("(9): Exit");
        
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
    
        this.Ioopreation[n - 1].oper(Database, User);
    }
        

    
@Override
    public String Print() {
     return  name + "<N/>" + email + "<N/>" + phonenumber + "<N/>" + "Normal";
    }

}
