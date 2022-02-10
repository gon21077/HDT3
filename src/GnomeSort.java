/**
 * Gnomesort
 * Objetivo: Ordenar en GnomeSort
 *
 * @author Juan Gonzalez Campo
 * @author Paulo Sánchez
 * @author Pedro Marroquin
 * @version 1.0 finalizado 09/02/2022
 */
import java.util.Arrays;

public class GnomeSort {
    static void gnomeSort(int arr[], int n)
    {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }

}
