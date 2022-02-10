/**
 * Bubblesort
 * Objetivo: Ordenar en Bubble
 *
 * @author Juan Gonzalez Campo
 * @author Paulo Sánchez
 * @author Pedro Marroquin
 * @version 1.0 finalizado 09/02/2022
 */
public class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
