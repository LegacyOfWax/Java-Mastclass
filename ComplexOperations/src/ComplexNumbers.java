public class ComplexNumbers {

    public double real;
    public double imaginary;

    public ComplexNumbers(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public void add(double real, double imaginary)
    {
        this.real += real; //this.real = this.real + real
        this.imaginary += imaginary; //this.imaginary = this.imaginary + imaginary
    }
    public void add(ComplexNumbers complexNumbers)
    {
        add(complexNumbers.getReal(), complexNumbers.getImaginary());
    }
    public void subtract(double real, double imaginary)
    {
        this.real -= real; //this.real = this.real - real
        this.imaginary -= imaginary; //this.imaginary = this.imaginary - imaginary
    }
    public  void subtract(ComplexNumbers complexNumbers)
    {
        subtract(complexNumbers.getReal(), complexNumbers.getImaginary());
    }
}
