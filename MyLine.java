class line {
    private int x1;
    private MyPoint begin;
    private MyPoint end;

    public line(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public line(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndinX() {
        return end.getX();
    }

    public void setEndinX(int x) {
        end.setX(x);
    }

    public int getEndinY() {
        return end.getY();
    }

    public void setEndinY(int y) {
        end.setY(y);
    }

    public int[] beginXY() {
        return begin.getxy();
    }

    public void setbeginXY(int x, int y) {
        begin.setxy(x, y);
    }

    public int[] endXY() {
        return end.getxy();
    }

    public void setendXY(int x, int y) {
        end.setxy(x, y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getgradient() {

        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "Myline{" +
                "x1=" + x1 +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}

public class MyLine {
    public static void main(String[] args) {
        line myline = new line(1, 2, 3, 4);
        System.out.println("Myline: " + myline);
        System.out.println("Length of myline: " + myline.getLength());
        System.out.println("Gradient of myline: " + myline.getgradient());
        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        line p3 = new line(p1, p2);
        System.out.println("p3: " + p3);
        System.out.println("Length of p3: " + p3.getLength());
        System.out.println("Gradient of p3: " + p3.getgradient());
    }
}