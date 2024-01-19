
import java.util.Scanner;

class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double divisor = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / divisor;
        double newImag = (this.imag * right.real - this.real * right.imag) / divisor;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }


    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }
}

public class Complex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();

        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + complex1);
        System.out.println(complex1 + " is " + (complex1.isReal() ? "a pure real" : "NOT a pure real") + " number");
        System.out.println(complex1 + " is " + (complex1.isImaginary() ? "a pure imaginary" : "NOT a pure imaginary") + " number");

        System.out.println("\nNumber 2 is: " + complex2);
        System.out.println(complex2 + " is " + (complex2.isReal() ? "a pure real" : "NOT a pure real") + " number");
        System.out.println(complex2 + " is " + (complex2.isImaginary() ? "a pure imaginary" : "NOT a pure imaginary") + " number");

        System.out.println("\n" + complex1 + " is " + (complex1.equals(complex2) ? "equal to" : "NOT equal to") + " " + complex2);

        MyComplex sum = complex1.addNew(complex2);
        System.out.println(complex1 + " + " + complex2 + " = " + sum);

        MyComplex sum2 = complex1.subtract(complex2);
        System.out.println(complex1 + "-" +complex2 + "=" + sum2);

        complex1.subtract(complex2);
System.out.println(complex1); // Output: 2+2i

// Subtract new
MyComplex result = complex1.subtractNew(complex2);
System.out.println(result); // Output: (2+2i)

// Multiply
complex1.multiply(complex2);
System.out.println(complex1); // Output: 2+8i

// Divide
complex1.divide(complex2);
System.out.println(complex1); // Output: 2+2i

// Conjugate
MyComplex conjugate = complex1.conjugate();
System.out.println(conjugate); // Output: (2-2i)
    }
}