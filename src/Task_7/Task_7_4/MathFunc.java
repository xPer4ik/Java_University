package Task_7.Task_7_4;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double getPI() {
        return Math.PI;
    }

    public double calculateCircleLength(double radius) {
        return 2 * Math.PI * radius;
    }
}
