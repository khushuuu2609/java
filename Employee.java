class emp{
    private int id;
    private String name;
    private String lname;
    private int Salary;

emp(int id,String name,String lname,int Salary){
        this.id=id;
        this.name = name;
        this.lname = lname;
        this.Salary = Salary;
    }

    public int getid() {
        return id;
    }
    public String getname() {
        return name;
    }
    public String getlname() {
        return lname;
    }
    public int getSalary() {
        return Salary;
    }

    public void setid(int id) {
        this.id=id;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setlname(String lname) {
        this.lname = lname;
    }
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }


    public int getAnSalary(){
        return 12*Salary;
    }

    public double raiseSalary(double per){
        double amt = Salary * (per/100);
        Salary += amt;
        return Salary;
    }

    public String toString(){
        return "Employee ID: "+getid()+"\nName :"+getname()+"Lastname: "+getlname()+"Salary: "+getSalary();
    }

}



public class Employee {
    public static void main(String[] args) {
        emp e1 = new emp(8, "Peter", "Tan", 2500);
        System.out.println(e1);  
  
        
        e1.setSalary(999);
        System.out.println(e1); 
        System.out.println("id is: " + e1.getid());
        System.out.println("firstname is: " + e1.getname());
        System.out.println("lastname is: " + e1.getlname());
        System.out.println("salary is: " + e1.getSalary());
  
        System.out.println("name is: " + e1.getname());
        System.out.println("annual salary is: " + e1.getAnSalary()); 
  
        
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1); 
    }
}
