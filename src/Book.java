public class Book {
    
String name;
String auther;
String publisher;
String address;
String Stuts;
int qyt;
double price;
int brwcopis;

public Book(){}

public Book(String name, String auther, String publisher, String address, String stuts, int qyt, double price,
        int brwcopis) {
    this.name = name;
    this.auther = auther;
    this.publisher = publisher;
    this.address = address;
    this.Stuts = stuts;
    this.qyt = qyt;
    this.price = price;
    this.brwcopis = brwcopis;
}




public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getAuther() {
    return auther;
}
public void setAuther(String auther) {
    this.auther = auther;
}
public String getPublisher() {
    return publisher;
}
public void setPublisher(String publisher) {
    this.publisher = publisher;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getStuts() {
    return Stuts;
}
public void setStuts(String stuts) {
    Stuts = stuts;
}
public int getQyt() {
    return qyt;
}
public void setQyt(int qyt) {
    this.qyt = qyt;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getBrwcopis() {
    return brwcopis;
}
public void setBrwcopis(int brwcopis) {
    this.brwcopis = brwcopis;
}


public String BookeSerchData() {
    return   name + "\n" + auther + "\n"+ publisher + "\n" + address
            + "\n" + Stuts + "\n" + String.valueOf(qyt)  + "\n" + String.valueOf(price) + "\n" + String.valueOf(brwcopis);
}

@Override
public String toString() {
    return   name + "<N/>" + auther + "<N/>"+ publisher + "<N/>" + address
            + "<N/>" + Stuts + "<N/>" + String.valueOf(qyt)  + "<N/>" + String.valueOf(price) + "<N/>" + String.valueOf(brwcopis);
}

}
