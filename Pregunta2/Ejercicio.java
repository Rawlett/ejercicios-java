package Pregunta2;

import java.util.Scanner;
import Pregunta2.Persona;

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
        Scanner t2 = new Scanner(System.in);
        int tam = 50;
        Persona[] personas = new Persona[tam]; 
        int edad;
        String sexo;
        for (int i = 0; i < tam; i++) {
            System.out.println("LEER PERSONAS: Persona nº: " + i);
            System.out.print("Introduce la edad: ");
            edad = t.nextInt();
            System.out.print("Introduce el sexo (hombre, mujer): ");
            sexo = t2.nextLine();
            
            personas[i] = new Persona(edad, sexo);
        }
        
        int mayorEdad = 0;
        int menoresEdad = 0;
        int masculinosMayores = 0;
        int femeninasMenores = 0;        
        
        for (int i = 0; i < tam; i++) {
            if(personas[i].edad >= 18){
                mayorEdad++;
            }else {
                menoresEdad++;
            }
            if(personas[i].edad >= 18 && personas[i].sexo.equals("hombre")){
                masculinosMayores++;
            }
            if(personas[i].edad < 18 && personas[i].sexo.equals("mujer")){
                femeninasMenores++;
            }
        }
        double porcentajeMayores = (mayorEdad / tam)*100;
        double porcentajeMujeres = (((mayorEdad - masculinosMayores) + femeninasMenores) / tam)*100;
        
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Cantidad de personas mayores de edad (18 años o más): " + mayorEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinosMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + femeninasMenores);
        System.out.println("Porcentaje de las personas mayores de edad respecto al total de personas: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de las mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}
