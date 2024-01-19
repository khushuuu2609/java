class Ball {
    private float x;
    private float y;
    private float radius;
    private float xDelta;
    private float yDelta;
    private int speed;
    private int directionInDegree;

    Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }


    Ball(float x, float y, int radius, int speed, int directionInDegree){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.speed=speed;
        this.directionInDegree=directionInDegree;
    }



    public float getx(){
        return x;
    }

    public float gety(){
        return y;
    }

    public float getxDelta(){
        return xDelta;
    }

    public float getyDelta(){
        return yDelta;
    }

    public float getradius(){
        return radius;
    }


    public float getspeed(){
        return speed;
    }

    public float getdirectionInDegree(){
        return directionInDegree;
    }



    public void setspeed(int speed){
       this.speed=speed;
    }

    public void setdirectionInDegree(int directionInDegree){
        this.directionInDegree=directionInDegree;
    }

    public void setx(float x){
        this.x = x;
    }

    public void sety(float y){
        this.y = y;
    }

    public void setxDelta(float xDelta){
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta){
        this.yDelta = yDelta;
    }

    public void setradius(float radius){
        this.radius= radius;
    }

    public void move(){
        x += xDelta;
        y += yDelta;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public void reflectHorizontal(){
        xDelta =- xDelta; 
    }

    public void reflectVertical(){
        yDelta =- yDelta; 
    }

    public String toString() {
        return "Ball x "+x+" y "+y+" Speed xDelta "+xDelta+" yDelta "+yDelta;
    }
}

public class BallClass {
    public static void main(String[] args) {
        // Test constructor and toString()
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball);  // toString()
        
        Ball ball2 = new Ball(2.3f,5.7f,30,2, 1);
        System.out.println(ball2);

        // Test Setters and Getters
        ball.setx(80.0f);
        ball.sety(35.0f);
        ball.setradius(5);
        ball.setxDelta(4.0f);
        ball.setyDelta(6.0f);
        System.out.println(ball);  // toString()
        System.out.println("x is: " + ball.getx());
        System.out.println("y is: " + ball.gety());
        System.out.println("radius is: " + ball.getradius());
        System.out.println("xDelta is: " + ball.getxDelta());
        System.out.println("yDelta is: " + ball.getyDelta());
        System.out.println("----------------------------"+ball2.getspeed());
        System.out.println("----------------------------"+ball2.getdirectionInDegree());
       
  
        // Bounce the ball within the boundary
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
           ball.move();
           System.out.println(ball);
           float xNew = ball.getx();
           float yNew = ball.gety();
           float radius = ball.getradius();
           // Check boundary value to bounce back
           if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
              ball.reflectHorizontal();
           }
           if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
              ball.reflectVertical();
           }
        }
     }
}
