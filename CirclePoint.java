class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle() {
        center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{center.getX(), center.getY()};
    }

    public void setCenterXY(int x, int y) {
        center.setxy(x, y);
    }

    
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

}


public class CirclePoint {
    public static void main(String[] args) {
    MyCircle myCircle=new MyCircle(2,3,4);
        MyPoint myPoint=new MyPoint(5,2);
        MyCircle myCircle1=new MyCircle(myPoint,4);
        System.out.println("MyCircle: "+myCircle);

        System.out.println("Distance: "+myCircle.distance(myCircle1));
        System.out.println("Circumference: "+myCircle1.getCircumference());
        System.out.println("Area: "+myCircle1.getArea());
        System.out.println("mypoint "+myPoint);
        System.out.println("mycircle1: "+myCircle1);
        System.out.println("mycircle1's Center: "+myCircle1.getCenter());
        System.out.println("mycircle's Center:"+myCircle.getCenter());
}

}





