class Account{
    private String id;
    private String name;
    private int Balance=0;

    Account(String id,String name){
        this.id=id;
        this.name = name;
    }

    Account(String id,String name,int Balance){
        this.id=id;
        this.name = name;
        this.Balance = Balance;
    }

    public String getid() {
        return id;
    }
    public String getname() {
        return name;
    }
    public int getBalance() {
        return Balance;
    }

    public int credit(int amt){
        Balance = amt + Balance;
        return Balance;
    }

    public int debit(int amt){
        if(amt<=Balance){
            System.out.println("can be transfer");
            return Balance = Balance - amt;
        }

        else { 
        return Balance=0;
    }
    
    }

    public int transfer(int amt){

        if(amt<=Balance){
            System.out.println("can be transfer");
            return Balance = Balance - amt;
        }



        else { System.out.println("cant be transfer");
        return Balance;
    }
    
}   

    public String toString(){
        return "Account id"+id+"Name "+name+"Balance "+Balance;
    }

}


