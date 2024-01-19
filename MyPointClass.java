class MyPoint {
    private int x = 0;
    private int y = 0;

    MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getxy() {
        int[] xy = { x, y };
        return xy;
    }

    public void setxy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint [x=" + x + ", y=" + y + "]";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Overloaded method to calculate distance to another MyPoint instance
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

}

public class MyPointClass {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setxy(3, 0); // Test setXY()
        System.out.println(p1.getxy()[0]);
        System.out.println(p1.getxy()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
    }
}
