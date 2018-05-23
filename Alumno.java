
/**
 * clase alumno
 * 
 * @author (fernando) 

 */
public class Alumno implements Comparable<Alumno>
{
    private String nombre;
    private String apellido;

    /**
     * Constructor for objects of class Alumno
     * 
     * @param nombre es el nombre de la persona - String
     * @param apellido son los apellidos de la persona - String
     */
    public Alumno(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellido;
    }

    @Override
    public String toString(){
        String aDevolver = getApellidos() + " " + getNombre();
        return aDevolver;
    }

    /**
     * Comparacion de ojetos con compareTo
     * 
     * @param objeto de tipo Persona
     * @return devuelve un entero en funcion de de la comparacion de los nombres o los apellidos 
     * 
     * Devuelve un entero positivo, negativo o cero:
     * persona1 > persona2 devuelve un valor positivo + 
     * persona1 < persona2 devuelve un valor negativo - 
     * persona1 es igual a persona2 devuelve un 0
     */
    @Override
    public int compareTo(Alumno persona){
        //compara to devuelve un entero lo primero seria definir una variable entera para devolverla mas tarde 
        int enteroADevolver = this.getApellidos().compareTo(persona.getApellidos());

        // decidimos orden que queremos ser comparado segun lo definamos ordenaremos segun como lo pogamos , 
        //lo pondremos por orden natura primero apellidos y luego nombre 

        //Si queremos establecer un orden natural para el tipo Persona
        //deberá ordenar primero por apellidos si es igual luego por nombre 
        //
        //
        if( enteroADevolver == 0){
            enteroADevolver = this.getNombre().compareTo(persona.getNombre());
        }

        return enteroADevolver;
    }

}
