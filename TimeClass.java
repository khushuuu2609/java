class MyTime{
    private int hour=0;
    private int minute=0;
    private int second=0;

    MyTime(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }
    MyTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour(){
        return hour;

    }
    public int getMinute(){
        return minute;

    }
    public int getSecond(){
        return second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }
    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    public MyTime nextMinute() {
        minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
        }
        return this;
    }
    public MyTime nextHour() {
        hour++;

                if (hour == 24) {
                    hour = 0;

        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            if (minute > 0) {
                minute--;
            } else {
                minute = 59;
                if (hour > 0) {
                    hour--;
                } else {
                    // If hour is already 0, keep it as 0
                    hour = 0;
                }
            }
        }
        return this;
    }
    public MyTime previousMinute() {

            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;

            }
        }
        return this;
    }
    public MyTime previousHour() {
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
        return this;
    }
}


public class TimeClass {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(23);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(0, 1, 1);
        System.out.println("Current time: "+t1);  // toString()


        // Test previousSecond()
        System.out.println("previous second time: "+t1.previousSecond());
        System.out.println("previous to previous second time: "+t1.previousSecond().previousSecond());

        // Test nextSecond();
        System.out.println("Next second time: "+t1.nextSecond());
        System.out.println("Next to next second time: "+t1.nextSecond().nextSecond());

        System.out.println("next minute time: "+t1.nextMinute());
        System.out.println("next hour time: "+t1.nextHour());
        System.out.println("previous minute time: "+t1.previousMinute());
        System.out.println("previous hour time: "+t1.previousHour());


        MyTime t2 = new MyTime(0, 0, 1);
        System.out.println(t2.previousSecond());

    }
}