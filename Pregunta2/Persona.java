package Pregunta2;


/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    public int edad;
    public String sexo; 
    
    public Persona(int e, String s) {
        this.edad = e;
        this.sexo = s;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public String getSexo() {
        return this.sexo;
    }
}
