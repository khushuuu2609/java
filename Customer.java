class CustomerInv{
    private int Id;
    private String Name;
    private int Discount;


    public CustomerInv(int Id, String Name, int Discount) {
        this.Id = Id;
        this.Name = Name;
        this.Discount = Discount;
    }


    public int getId() {
        return Id;
    }


    public void setId(int id) {
        Id = id;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public int getDiscount() {
        return Discount;
    }


    public void setDiscount(int discount) {
        Discount = discount;
    }


    @Override
    public String toString() {
        return "CustomerInv [Id=" + Id + ", Name=" + Name + ", Discount=" + Discount + "]";
    }
 }
 
class Invoice{
    private int InvNo;
    private CustomerInv customer;
    private double amount;

    public Invoice(int invNo, CustomerInv customer, double amount) {
        this.InvNo = invNo;
        this.customer = customer;
        this.amount = amount;
    }

    public int getInvNo() {
        return InvNo;
    }

    public void setInvNo(int invNo) {
        InvNo = invNo;
    }

    public CustomerInv getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerInv customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }
    
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount * (100 - customer.getDiscount()) / 100;
    }

    @Override
    public String toString() {
        return "Invoice [InvNo=" + InvNo + ", customer=" + customer + ", amount=" + amount + "]";
    }
  
}
public class Customer {
    public static void main(String[] args) {
        // Test Customer class
        CustomerInv c = new CustomerInv(88, "Tan Ah Teck", 10);
        System.out.println(c);  // Customer's toString()
  
        c.setDiscount(8);
        System.out.println(c);
        System.out.println("id is: " + c.getId());
        System.out.println("name is: " + c.getName());
        System.out.println("discount is: " + c.getDiscount());
  
        // Test Invoice class
        Invoice inv1 = new Invoice(101, c , 888);
        System.out.println(inv1);
  
        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getInvNo());
        System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
     }
}
