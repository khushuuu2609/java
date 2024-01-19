import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Create two BigInteger instances
        BigInteger num1 = new BigInteger("111111111111566666666666666666666611111111111111111111111111111111111111111111111111");
        BigInteger num2 = new BigInteger("22222222222222125666666666666651111111111111115666666666666666222222222222222222222222222222222222");

        // Add and print the result
        BigInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        // Multiply and print the result
        BigInteger product = num1.multiply(num2);
        System.out.println("\n \n Product: " + product);
    }
}
