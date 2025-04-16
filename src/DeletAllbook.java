import java.util.Scanner;

import javax.xml.crypto.Data;

/**
 * DeletAllbook
 */
public class DeletAllbook implements Ioopreation{
public DeletAllbook(){};
    @Override
    public void oper(Database Database, Users users) {
   System.out.println("are you shure you want to delet all books "+"\n"+
   "1:Yes"+"\n"+
   "2:Minu"
   );
   Scanner in =new Scanner(System.in);
   int i = in.nextInt();
        if(i == 1)
        {
        Database.DeletAllbook();
        }else{
        users.Menu(Database, users);
        }

    }

    
}