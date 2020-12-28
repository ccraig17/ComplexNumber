public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary){
        // +=real adds the real number to the real number of the complex number.
        this.real +=real;
        // +=imaginary adds the imaginary number to the imaginary number of the complex number.
       this.imaginary +=imaginary;
    }
    public void add(ComplexNumber number){
        add(number.getReal(), number.getImaginary());
    }
    public void subtract(double real, double imaginary){
        //-=real subtracts the real number to the real number of the complex number
        this.real -=real;
        //-=imaginary adds the imaginary number to the imaginary number of the complex number.
        this.imaginary -=imaginary;

    }
    public void subtract(ComplexNumber number){

        subtract(number.getReal(), number.getImaginary());
    }
}
