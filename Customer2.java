class Customer{
    private int Id;
    private String name;
    private char Address;


    public Customer(int id, String name, char address) {
        this.Id = id;
        this.name = name;
        this.Address = address;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getAddress() {
        return Address;
    }
    public void setAddress(char address) {
        Address = address;
    }
    @Override
    public String toString() {
        return "Customer [Id=" + Id + ", name=" + name + ", Address=" + Address + "]";
    }
}

class Account{
    private int Id;
    private Customer customer;
    private double balance=0;

    
    public Account(int id, Customer customer, double balance) {
        Id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.Id = id;
        this.customer = customer;
    }

    public int getId() {
        return Id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [Id=" + Id + ", customer=" + customer + ", balance=" + balance + "]";
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double getDeposit(double amount){
      balance = balance + amount;
      return balance;
    }

    public Account withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
            } else{
                System.out.println("Insufficient funds");
                }
                return this;
    }
}



public class Customer2 {
    public static void main(String[] args) {
        
        Customer c = new Customer(10,"khushboo",'f');
        Customer c2 = new Customer(11,"khushi",'f');

        Account a = new Account(5,c,2000);
        Account a2 = new Account(6,c2,3000);



        
        System.out.println(a.getCustomerName());
        System.out.println(a.getBalance());
        System.out.println(a.withdraw(100));
        System.out.println(a.getDeposit(1000));

       
        System.out.println(a2.getCustomerName());
        System.out.println(a2.getBalance());
        System.out.println(a2.withdraw(100));
        System.out.println(a2.getDeposit(1000));


    }  
}
