/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

/**
 *
 * @author Usuario
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 12;
        int b = 14;
        System.out.printf("a=%d b=%d\n", a, b);

        a++;
        b--;
        System.out.printf("a++=%d b--=%d\n", a, b);

        a++;
        b--;
        System.out.printf("a++=%d b--=%d\n", a, b);

        int c = a++;
        int d = b--;

        System.out.printf("c=%d d=%d a=%d b=%d\n", c, d, a, b);

        int e = ++a;
        int f = --b;

        System.out.printf("e=%d f=%d a=%d b=%d\n", e, f, a, b);

        boolean bol1 = a == b;
        boolean bol2 = b <= f;

        if (bol1) {
            System.out.println("bol1 es verdadero");
        } else {
            System.out.println("bol2 es falso");
        }

        if (bol2) {
            System.out.println("bol1 es verdadero");
        } else {
            System.out.println("bol2 es falso");
        }

        if (bol1 || bol2) {
            System.out.println("la condicion es verdadera");
        } else {
            System.out.println("la condicion es falsa");
        }

    }

}
