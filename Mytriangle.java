class Triangle{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;


    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangle(int x1, int y1, int x2, int y2,int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    @Override
    public String toString() {
        return "Triangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 =  v2.distance(v3);
        double side3 =  v1.distance(v3);
        return side1 + side2 + side3;
    }
    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v1.distance(v3);

        if (side1 == side2 && side2 == side3) {
            return "Equilateral Triangle";
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }
}



public class Mytriangle {
    public static void main(String[] args) {
        Triangle myTriangle=new Triangle(1,3,2,4,3,5);
        Triangle myTriangle1=new Triangle(1,3,1,3,1,3);
        Triangle myTriangle4=new Triangle(1,4,1,3,1,3);

        MyPoint myPoint=new MyPoint(1,4);
        MyPoint myPoint1=new MyPoint(2,5);
        MyPoint myPoint2=new MyPoint(1,3);
        Triangle myTriangle2=new Triangle(myPoint,myPoint1,myPoint2);
        System.out.println(myTriangle1.getType());
        System.out.println(myTriangle4.getType());
        System.out.println(myTriangle2.getPerimeter());
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.toString());
    }

}
