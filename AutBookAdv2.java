class Author {
    private String name;
    private String email;
    public int length;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String toString() {
        return "ID: " + name + " Email: " + email;

    }
}

class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    Book(String isbn, String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    Book(String isbn, String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getisbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        String authorName = author.getname();
        return authorName;
    }

    @Override
    public String toString() {
        return "Book isbn= "+isbn+" Author name: "+author.getname()+" Author email: "+author.getemail()+" Price: "+price+" qty: "+qty;
    }




}

public class AutBookAdv2 {
    public static void main(String[] args) {

        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
      System.out.println(a1);

      a1.setemail("ahteck@somewhere.com");
      System.out.println(a1);
      System.out.println("name is: " + a1.getname());
      System.out.println("email is: " + a1.getemail());

      // Test Book class
      Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
      System.out.println(b1);

      b1.setPrice(9.9);
      b1.setQty(99);
      System.out.println(b1);
      System.out.println("isbn is: " + b1.getisbn());
      System.out.println("name is: " + b1.getName());
      System.out.println("price is: " + b1.getPrice());
      System.out.println("qty is: " + b1.getQty());
      System.out.println("author is: " + b1.getAuthor());  // Author's toString()
      System.out.println("author's name: " + b1.getAuthor());
      System.out.println("author's name: " + b1.getAuthor().getname());
      System.out.println("author's email: " + b1.getAuthor().getemail());

    }
}
