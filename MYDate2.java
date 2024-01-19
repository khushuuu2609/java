class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 1 && year <= 9999 && month >= 1 && month <= 12) {
            int dayMax = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                dayMax = 29;
            }
            return day >= 1 && day <= dayMax;
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid month or day");
        }
    
        // Month adjustment for January and February
        if (month < 3) {
            month += 12;
            year--;
        }
    
        // Zeller's-like algorithm for the Gregorian calendar
        int h = (day + 13 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
    
        // Adjust to the representation where Sunday is 0
        return (h + 6) % 7;
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public void setDay(int day) {
        int dayMax = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            dayMax = 29;
        }
        if (day >= 1 && day <= dayMax) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return DAYS[dayOfWeek] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        day++;
        int dayMax = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            dayMax = 29;
        }
        if (day > dayMax) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (year > 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            previousMonth();
            int dayMax = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                dayMax = 29;
            }
            day = dayMax;
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            previousYear();
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (year < 1) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }
}
public class MYDate2 {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);             // Tuesday 28 Feb 2012
        System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
        System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
        System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(d1.nextYear());  // Monday 1 Apr 2013
        
        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);                 // Monday 2 Jan 2012
        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010
        
        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());  // Monday 28 Feb 2011
        
        // MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
        // MyDate d5 = new MyDate(2011, 2, 29)
    }
}
