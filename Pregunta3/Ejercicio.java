package Pregunta3;

import java.util.Scanner;

/**
 * Write a description of class Ejercicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio
{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("LEER HORASTRABAJADAS: ");
        int horas = t.nextInt();
        System.out.print("LEER TARIFA: ");
        double tarifa = t.nextDouble();
        double sueldo = horas*tarifa;
        
        if(horas > 40) {
            sueldo += (horas - 40) * (tarifa * 0.5);
        }
        
        System.out.println("Su sueldo sería: " + sueldo);
    }
}
