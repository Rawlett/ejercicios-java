package Pregunta1;

import java.util.Scanner;

/**
 * Lee un número entero y determina si es par o impar. Si es par, muestra en orden descendiente
 * los números pares desde él hasta el cero. Si es impar igual pero con impares y desde el 
 * mismo hasta el uno.
 * 
 * Raúl González Valiente
 */
public class Ejercicio
{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("LEER NUMERO: ");
        int num = t.nextInt();
        if (num%2==0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
        
        for (int i = num; i > 0; i-=2) {
            System.out.println(i + "");
        }
        if (num%2 == 0) {
            System.out.println("0");
        }
    }
}
