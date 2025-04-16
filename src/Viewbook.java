import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Viewbook
 */
public class Viewbook implements Ioopreation{

public Viewbook(){};

    @Override
    public void oper(Database Database,Users User) {
      ArrayList <Book>AllBooks = Database.getBookList();
      System.out.println("Name\t auther\\t publisher\\t address\\t Stuts\\t qyt\\t price\\t brwcopis\\\\t");

      for (Book Book : AllBooks) {
        System.out.println(Book.getName()+"\t" + Book.getAuther()+"\t" +Book.getPublisher()+"\t" +Book.getAddress()+"\t"+Book.getStuts()+"\t"+Book.getQyt()+"\t"+Book.getPrice()+"\t"+Book.getBrwcopis()+"\t");
        User.Menu(Database, User);
      }


    }

    
}