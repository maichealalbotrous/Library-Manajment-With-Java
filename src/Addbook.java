import java.util.Scanner;

public class Addbook implements Ioopreation{
public Addbook(){};
    @Override
    public void oper(Database Database,Users User) {
    Scanner in =  new Scanner(System.in);
    Book book = new Book();

    System.out.println("Enter the Book name");
    String name =in.nextLine();
    int i = Database.getBook(name);
    if(i>-1)
    {
        System.out.println("there is abook with asame name");
        User.Menu(Database, User);
        return;
    }else{
        book.setName(name);

        System.out.println("Enter the Book auther");
        book.setAuther(in.next());
        System.out.println("Enter the Book publisher");
        book.setPublisher(in.next());
        System.out.println("Enter the Book address");
        book.setAddress(in.next());
        System.out.println("Enter the Book stuts");
        book.setStuts(in.next());
        System.out.println("Enter the Book qyt");
        book.setQyt(in.nextInt());
        System.out.println("Enter the Book price");
        book.setPrice(in.nextDouble());
        System.out.println("Enter the Book brwcopis");
        book.setBrwcopis(in.nextInt()); 
        Database.Addbook(book);
         System.out.println("the book added succesfully");
         User.Menu(Database,User);
    }

    }
    
}
