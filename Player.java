class Player1 {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player1(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
        System.out.println("Player " + number + " moved to (" + x + ", " + y + ")");
    }

    public void jump(float zDisp) {
        z += zDisp;
        System.out.println("Player " + number + " jumped to z = " + z);
    }

    public boolean near(Ball ball) {
        float distance = calculateDistance(ball.getx(), ball.gety());
        return distance <= 5.0f; // Adjust the threshold as needed
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            System.out.println("Player " + number + " kicked the ball!");
            // Implement the logic for kicking the ball
        } else {
            System.out.println("Player " + number + " is not near the ball.");
        }
    }

    private float calculateDistance(float targetX, float targetY) {
        return (float) Math.sqrt(Math.pow(x - targetX, 2) + Math.pow(y - targetY, 2));
    }
}

public class Player {
    public static void main(String[] args) {
        Player1 player1 = new Player1(1, 10.0f, 20.0f);
        Player1 player2 = new Player1(2, 5.0f, 5.0f);
        Ball ball = new Ball(15.0f, 25.0f, 5, 2.0f, 3.0f);

        player2.move(5.0f, 8.0f);
        player2.jump(3.0f);

        if (player1.near(ball)) {
            System.out.println("Player 1 is near the ball.");
        } else {
            System.out.println("Player 1 is not near the ball.");
        }

        player1.kick(ball);
    }
}
