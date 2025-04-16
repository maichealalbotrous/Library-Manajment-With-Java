import java.util.Scanner;

public class DeletBook implements Ioopreation{
public DeletBook(){};
    @Override
    public void oper(Database Database, Users users) {
     Scanner in = new Scanner(System.in);
        System.out.println("pleas Enter the Book name");
        String name = in.nextLine();
        int i = Database.getBook(name);
        if(i>-1)
        {
            Database.DeletBook(i);
            System.out.println("The Book Was Removed");
        }else{
            System.out.println("The Book Not Found");
        }
        users.Menu(Database,users);

    }
    
}
