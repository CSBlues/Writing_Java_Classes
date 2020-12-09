public class MyComplex {
    private double real;
    private double img;

    public MyComplex(){
        this.real = 0.0;
        this.img = 0.0;
    }

    public MyComplex(double a, double b){
        this.real = a;
        this.img = b;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    @Override
    public String toString() {
        if (this.img < 0.0){
            return real + " - " + Math.abs(this.img) + "i";
        }else if (this.img > 0.0){
            return real + " + " + this.img + "i";
        }else{
            return "" + real;
        }
    }

    boolean isReal(){
        return (this.real != 0.0 && this.img == 0.0 || this.real == 0.0 && this.img == 0.0 );
    }

    boolean isImaginary(){
        return (this.real == 0.0 && this.img != 0.0 || this.real == 0.0 && this.img == 0.0 ) ;
    }

    void add(MyComplex c){
        this.real += c.real;
        this.img += c.img;
    }
    void multiply(MyComplex c){
        double tempReal = this.real*c.real - this.img*c.img;
        this.img = (this.real*c.img) + (this.img*c.real);
        this.real = tempReal;
    }

    void conjugate(){
        this.img *= -1;
    }

    double magnitude(){
        return Math.sqrt(this.real*this.real + this.img*this.img);
    }

    public static MyComplex addNew(MyComplex a, MyComplex b){
        a.add(b);
        return a;
    }

    public static MyComplex multiplyNew(MyComplex a, MyComplex b){
        a.multiply(b);
        return a;
    }
}