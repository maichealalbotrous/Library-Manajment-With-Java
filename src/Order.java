public class Order {
    Users user;
    Book book;
    int qty;
    Double price;

    public Order(){};
    public Order(Users user, Book book, int qty, Double price) {
        this.user = user;
        this.book = book;
        this.qty = qty;
        this.price = price;
    }


    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String Print()
    {
        return book.getName() + "</N>"+user.getName() + "</N>"+String.valueOf(qty) + "</N>"+String.valueOf(price) + "</N>";
    }
}

