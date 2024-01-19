public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public int getHeight() {
        return y2 - y1 + 1;
    }

    public boolean collides(Ball ball) {
        float ballX = ball.getx();
        float ballY = ball.gety();
        float ballRadius = ball.getradius();

        if (ballX - ballRadius <= this.x1 || ballX + ballRadius >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }

        if (ballY - ballRadius <= this.y1 || ballY + ballRadius >= this.y2) {
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    public boolean collidesWith(Ball ball) {
        if (ball.getx() - ball.getradius() <= this.x1 ||
            ball.getx() - ball.getradius() >= this.x2) {
           ball.reflectHorizontal();
           return true;
        }
        return false;
    }

    

    @Override
    public String toString() {
        return "Container [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + "]";
    }

    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
           ball.move();
           box.collidesWith(ball);
           System.out.println(ball); // manual check the position of the ball
        }
        }
    }
