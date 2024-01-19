class Author{
    public int length;
    private String name;
    private String email;
    private char gender;

    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString() {
        return " Author name:"+name+" email "+email+" gender "+gender;
    }
}
class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty=0;
    Book(String name,Author[] author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    Book(String name,Author[] author,double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthor(){
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    public String[] getAuthorNames() {
        String[] authorNames = new String[author.length];
        for (int i = 0; i < author.length; i++) {
            authorNames[i] = author[i].getName();
        }
        return authorNames;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public void setQty(int qty){
        this.qty=qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsInfo = new StringBuilder();
        for (Author author : author) {
            authorsInfo.append("\nAuthor name: ").append(author.getName())
                    .append("\nAuthor Email: ").append(author.getEmail())
                    .append("\nAuthor gender: ").append(author.getGender())
                    .append("\n-------------------");
        }

        return " Book name: " + name +
                "\nAuthors:" + authorsInfo +
                "\n Book price: " + price +
                "\nBook qty: " + qty;
    }
}



public class AuthorClassAdv {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

   }
}