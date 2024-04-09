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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "La #Universidad Tecnica Particular de Loja# tiene dos modalidades de estudios.";

        int inicio = frase.indexOf("#");
        int fin = frase.indexOf("#", inicio + 1);
        String cadena = frase.substring(inicio + 1, fin);
        System.out.printf("%d %d %s", inicio, fin, cadena);
        
        int busq1 = frase.indexOf("#");
        int contador=0;
        
            
        }
        
        
    }

}
