import java.util.ArrayList;
import java.util.Collections;
/**
 * Clase encargada de ordenar alfabeticamente la lista en funcion del metodo compareTo 
 * (por apellidos o nombre)
 * 
 * @author (fernando) 
 */
public class Principal
{
    private ArrayList <Persona> lista;

    /**
     * Constructor for objects of class Principal
     */
    public Principal()
    {
        lista = new ArrayList<>();
        Persona p1 = new Persona("Judit","Bécquer");
        Persona p2 = new Persona("Javier","Maroto");
        Persona p3 = new Persona("Enrique","Pastor");
        Persona p4 = new Persona("Antonio","Recio");
        Persona p5 = new Persona("Lola","Reynolds");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

    }

    /**
     * Metodo para ordenar el ArrayList alfabeticamente
     */
    public void ordenar(){
        Collections.sort(lista);
        System.out.println("Orden natural alfabetico: " + lista );
    }

    /**
     * Comparar cadenas de texto con compareTo
     */

    public void comparadorDeCadenasDeTexto(){
        String cadena1 = "Adios";
        String cadena2 = "Hola";

        if (cadena1.compareTo(cadena2) == 0){
            System.out.println(cadena1 + " y " +  cadena2 + " son iguales");
        }
        else if (cadena1.compareTo(cadena2) < 0){
            System.out.println (cadena1 + " va antes que "+ cadena2);
        }
        else if (cadena1.compareTo(cadena2) > 0){
            System.out.println(cadena2 + " va después que " + cadena1);
        }
    }
}
