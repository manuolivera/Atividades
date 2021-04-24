
package sample;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public Triangulo() {
    }

    public double Area() {
        double p = (this.a + this.b + this.c) / 2.0D;
        double area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return area;
    }
}
