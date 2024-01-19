public class Polynomial {
    private double[] coeffs;

    // Constructor with varargs
    public Polynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Getter for degree
    public int getDegree() {
        return coeffs.length - 1;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int degree = getDegree();

        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i == degree) {
                    result.append(coeffs[i]);
                } else {
                    result.append((coeffs[i] > 0) ? " + " : " - ").append(Math.abs(coeffs[i]));
                }

                if (i > 0) {
                    result.append("x");

                    if (i > 1) {
                        result.append("^").append(i);
                    }
                }
            }
        }

        return result.toString();
    }

    // Evaluate method
    public double evaluate(double x) {
        double result = 0.0;
        int degree = getDegree();

        for (int i = degree; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }

        return result;
    }

    // Add method
    public Polynomial add(Polynomial another) {
        int maxLength = Math.max(this.coeffs.length, another.coeffs.length);
        double[] resultCoeffs = new double[maxLength];

        for (int i = 0; i < this.coeffs.length; i++) {
            resultCoeffs[i] += this.coeffs[i];
        }

        for (int i = 0; i < another.coeffs.length; i++) {
            resultCoeffs[i] += another.coeffs[i];
        }

        this.coeffs = resultCoeffs;
        return this;
    }

    // Multiply method
    public Polynomial multiply(Polynomial another) {
        int newLength = this.coeffs.length + another.coeffs.length - 1;
        double[] resultCoeffs = new double[newLength];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < another.coeffs.length; j++) {
                resultCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        this.coeffs = resultCoeffs;
        return this;
    }

    // Test driver
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(1.1, 2.2, 3.3);
        Polynomial p2 = new Polynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Polynomial p1: " + p1);
        System.out.println("Polynomial p2: " + p2);

        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("Degree of p2: " + p2.getDegree());

        System.out.println("Evaluate p1 at x = 2.0: " + p1.evaluate(2.0));

        p1.add(p2);
        System.out.println("Sum of p1 and p2: " + p1);

        Polynomial p3 = new Polynomial(2.0, 1.0);
        p1.multiply(p3);
        System.out.println("Product of p1 and p3: " + p1);
    }
}
