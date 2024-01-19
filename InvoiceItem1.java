
class InvoiceItem{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    InvoiceItem( String id, String desc,int qty,double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    public String getId(){
        return id;
    }
    public String getdesc(){
        return desc;
    }
    public int getlqty(){
        return qty;
    }
    public double getunitPrice(){
        return unitPrice;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setdesc(String desc){
        this.desc=desc;
    }
    public void setlqty(int qty){
        this.qty=qty;
    }
    public void setunitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem id: "+id+" desc : "+desc+" qty: "+qty+" unitprice "+unitPrice;
    }
}

public class InvoiceItem1{

        public static void main(String[] args) {
            // Test constructor and toString()
            InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
            System.out.println(inv1);  // toString();

            // Test Setters and Getters
            inv1.setlqty(999);
            inv1.setunitPrice(0.99);
            System.out.println(inv1);  // toString();
            System.out.println("id is: " + inv1.getId());
            System.out.println("desc is: " + inv1.getdesc());
            System.out.println("qty is: " + inv1.getlqty());
            System.out.println("unitPrice is: " + inv1.getunitPrice());

            // Test getTotal()
            System.out.println("The total is: " + inv1.getTotal());
        }
    }

