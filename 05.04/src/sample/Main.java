//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sample;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Triangulo x = new Triangulo();
        x.a = 3.0D;
        x.b = 4.0D;
        x.c = 5.0D;
        Triangulo y = new Triangulo();
        y.a = 7.5D;
        y.b = 4.5D;
        y.c = 4.02D;
        double areaX = x.Area();
        double areaY = y.Area();
        System.out.println("Área de x = " + areaX);
        System.out.println("Área de y = " + areaY);
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

    }
}