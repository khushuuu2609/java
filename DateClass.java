class Date {
    private int day;
    private int month;
    private int year;

Date(int day,int month,int year){
    this.day = day;
    this.month= month;
    this.year= year;
}

public int getday(){
    return day;
}

public int getmonth(){
    return month;
}

public int getyear(){
    return year;
}



public void setday(int day){
    this.day=day;
}

public int setmonth(int month){
    return month;
}

public int setyear(int year){
    return year;
}

public void setdate(int day,int month,int year){
    this.day = day;
    this.month= month;
    this.year= year;
}

public String toString(){
    return String.format("%02d/%02d/%04d", day, month, year);
    }

}

public class DateClass{
    public static void main (String[] args) {
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);  // toString()
  
        d1.setmonth(12);
        d1.setday(9);
        d1.setyear(2099);
        System.out.println(d1);  // toString()
        System.out.println("Month: " + d1.getmonth());
        System.out.println("Day: " + d1.getday());
        System.out.println("Year: " + d1.getyear());
  
        
        d1.setdate(11, 4, 2016);
        System.out.println(d1); 
    }
}

