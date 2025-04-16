import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.crypto.Data;

public class Database {

    ArrayList<Users> UsersList = new ArrayList<>();
    ArrayList<String> UsersName = new ArrayList<>();
    ArrayList<Book> BookList = new ArrayList<>();
    ArrayList<String> Bookname = new ArrayList<>();
    ArrayList<Order> OrderList = new ArrayList<>();

    File userFile = new File("data/usersdata.txt");
    File booksfile = new File("data/booksdata.txt");
    File ordersfile = new File("data/Orders.txt");

    File folder = new File("data");

    public Database() {

        if (!folder.exists()) {
            folder.mkdirs();
        }
        if (!userFile.exists()) {
            try {
                userFile.createNewFile();
            } catch (Exception e) {
            }

        }
        if (!booksfile.exists()) {
            try {
                booksfile.createNewFile();
            } catch (Exception e) {
            }

        }
        if (!ordersfile.exists()) {
            try {
                ordersfile.createNewFile();
            } catch (Exception e) {
            }

        }
        try {
            getusersdata();
            getbooksdata();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };

    public void Adduser(Users User) {
        UsersList.add(User);
        UsersName.add(User.getName());
        saveUsers();
    }

    public void Addbook(Book book) {
        BookList.add(book);
        Bookname.add(book.getName());
        saveBook();

    }

    public int Login(String email, String phonenumber) {
        int n = -1;
        for (Users user : UsersList) {
            if (user.getEmail().equals(email) && user.getPhonenumber().equals(phonenumber)) {

                n = UsersList.indexOf(user);
                break;
            }
        }
        return n;
    }

    public Users getuser(int index) {
        if (index >= 0 && index < UsersList.size()) {
            return UsersList.get(index);
        }
        return null;
    }

    public void getusersdata() throws IOException {
        String text = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(userFile));
            String s1;
            while ((s1 = br1.readLine()) != null) {
                text += s1;
            }

            String[] a1 = text.split("<NewUser/>");
            for (String s : a1) {
                String[] a2 = s.split("<N/>");
                if (a2.length >= 4) {
                    if (a2[3].matches("Admin")) {
                        Users User = new AdminUser(a2[0], a2[1], a2[2]);
                        UsersList.add(User);
                    } else {
                        Users User = new NormalUs(a2[0], a2[1], a2[2]);
                        UsersList.add(User);
                    }
                } else {
                    System.err.println("Invalid data format: " + s);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }
    }

    public void getbooksdata() throws IOException {
        String text = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(booksfile));
            String s1;
            while ((s1 = br1.readLine()) != null) {
                text += s1;
            }
            String[] a1 = text.split("<NewUser/>");
            if (a1.length >= 2) {
                for (String s : a1) {
                    String[] a2 = s.split("<N/>");
                    Book book = new Book(a2[0], a2[1], a2[2], a2[3], a2[4], Integer.parseInt(a2[5]),
                            Double.parseDouble(a2[6]), Integer.parseInt(a2[7]));
                    BookList.add(book);
                    Bookname.add(book.getName());

                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }

    }

    public void getOrders() throws IOException {
        String text = "";
        try {

            BufferedReader br1 = new BufferedReader(new FileReader(ordersfile));
            String s1;
            while ((s1 = br1.readLine()) != null) {
                text += s1;
            }
            String[] a1 = text.split("<NewUser/>");
            for (String s : a1) {
                String[] a2 = s.split("<N/>");

                // Order order = new Order(a2[0],a2[1],
                // Integer.parseInt(a2[2]),Double.parseDouble(a2[3]));

            }

        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }

    }

    public void saveUsers() {
        String text = "";
        for (Users user : UsersList) {
            text += user.Print() + "<NewUser/>";
        }
        System.out.println("the user was saved");
        try {
            PrintWriter datasave = new PrintWriter(userFile);
            datasave.print(text);
            datasave.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    public void saveBook() {
        String text = "";
        for (Book book : BookList) {
            text += book.toString() + "<NewUser/>";
        }
        System.out.println("the user was saved");
        try {
            PrintWriter datasave = new PrintWriter(booksfile);
            datasave.print(text);
            datasave.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    public void saveOrder() {
        String text = "";
        for (Order order : OrderList) {
            text += order.Print() + "<NewUser/>";
        }
        try {
            PrintWriter b = new PrintWriter(ordersfile);
            b.print(text);
            b.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Book> getBookList() {
        return BookList;
    }

    public int getBook(String name) {
        int i = -1;
        for (Book book : BookList) {
            if (name.matches(book.getName())) {
                i = BookList.indexOf(book);
            }
        }
        return i;
    }

    public Book getSercheadBook(int i) {
        return BookList.get(i);
    }

    public void DeletBook(int index) {
        BookList.remove(index);
        Bookname.remove(index);
    }

    public void DeletAllbook() {

        if (userFile.exists() == true) {
            try {
                userFile.delete();
            } catch (Exception e) {
            }

        }
        if (booksfile.exists() == true) {
            try {
                booksfile.delete();
            } catch (Exception e) {
            }

        }

        if (ordersfile.exists() == true) {
            try {
                ordersfile.delete();
            } catch (Exception e) {
            }

        }
    }

}
