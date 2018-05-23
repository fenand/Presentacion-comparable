
/**
 * Clase persona
 * 
 * @author (fernando) 
 */
public class Persona implements Comparable <Persona> 
{

    private String nombre;
    private String apellido;

    Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return this.nombre + " " + this.apellido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }	

    /**
     * Metodo para comparar los nombres o los apellidos y ordenarlos con un orden natural
     * 
     * @param  p objeto del tipo persona 
     * 
     * @return devuelve un entero en funcion de de la comparacion de los nombres o los apellidos 
     * 
     * Devuelve un entero positivo, negativo o cero:
     * persona1 > persona2 devuelve un valor positivo + 
     * persona1 < persona2 devuelve un valor negativo - 
     * persona1 es igual a persona2 devuelve un 0
     */ 
    @Override
    public int compareTo(Persona p){

        return this.getApellido().compareTo(p.getApellido()); //comparar apellidos y ordenarlo alfabeticamente de forma natural

        //return this.getNombre().compareTo(p.getNombre()); //comparar nombres y ordenarlo alfabeticamente de forma natural
    }

}