package InternetShop2;

public class Arithmetic {
    public int a, b;

    public Arithmetic(int c, int d) {
        this.a = c;
        this.b = d;
    }
    public int sum(){
        return a + b;
    }
    public int difference(){
        return a - b;
    }
    public int multiply(){
        return a * b;
    }
    public int averageValue(){
        return (a * b) / 2;
    }
    public int minAndMaxValue(){
        return Math.max(a, b);
    }

}
