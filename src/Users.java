public abstract class Users {
    String name;
    String email;
    String phonenumber;
    Ioopreation []Ioopreation;

    public Users() {
    }

    public Users(String name) {
        this.name = name;
    }

    public Users(String name, String email, String phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public abstract void Menu(Database database, Users user);

    protected abstract String Print();

   

   
}

