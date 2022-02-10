/**
 * Controlador
 * Objetivo: Imprimir cada uno de los arrays
 *
 * @author Juan Gonzalez Campo
 * @author Paulo Sánchez
 * @author Pedro Marroquin
 * @version 1.0 finalizado 09/02/2022
 */
import java.util.Arrays;
public class Controlador {

    public void imprimirArray(int[] array)
    {
        for(int i = 0; i< array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    public boolean verificarInt(String entrada)
    {
        try{
            int i = Integer.parseInt(entrada);
            return true;
        }catch(Exception e)
        {
            System.out.println("Ingrese una opcion valida");
            return false;
        }

    }
}
