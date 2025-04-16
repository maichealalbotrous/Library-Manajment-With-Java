import java.util.Scanner;

public class search implements Ioopreation{

public search (){};

    @Override
    public void oper(Database Database,Users User) {
        Scanner in = new Scanner(System.in);

        System.out.println("pleas Enter the Book Name :");
        String Name = in.nextLine();
        int i = Database.getBook(Name);
        if(i>-1)
        {
           System.out.println("\n"+Database.getSercheadBook(i).BookeSerchData()+"\n");

        }else{
            System.out.println("The Book Not Found");
        }

        User.Menu(Database, User);
    }
    
}
