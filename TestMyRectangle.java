
class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Other methods
    public double getWidth() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public double getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 5);
        MyPoint point2 = new MyPoint(4, 2);

        MyRectangle rectangle1 = new MyRectangle(point1, point2);
        MyRectangle rectangle2 = new MyRectangle(2, 6, 6, 3);

        System.out.println(rectangle1.toString());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println(rectangle2.toString());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
