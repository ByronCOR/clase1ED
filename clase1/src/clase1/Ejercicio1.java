/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar su nombre");
        String nombre = entrada.nextLine();

        System.out.println("ingresar su peso en Kilogramos");
        double peso = entrada.nextDouble();
        System.out.println("ingresar su altura en cm");
        double altura = entrada.nextDouble();

        double imc;
        double m;
        m = altura / 100;
        imc = peso /(m*m);
        System.out.printf("%s su IMC es %s", nombre, imc);

    }

}
