/**
 * Radixsort
 * Objetivo: Ordenar en radix
 *
 * @author Juan Gonzalez Campo
 * @author Paulo Sánchez
 * @author Pedro Marroquin
 * @version 1.0 finalizado 09/02/2022
 */
import java.io.*;
import java.util.*;

import static java.lang.Math.abs;

public class RadixSort {
    public int getMax(int a[], int n) {
        int max = a[0];
        for(int i = 1; i<n; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max; //maximum element from the array
    }

    public void countingSort(int a[], int n, int place) // function to implement counting sort
    {
        int[] output = new int[n+1];
        int[] count = new int[10];

        // Calculate count of elements
        for (int i = 0; i < n; i++)
            count[abs((a[i] / place) % 10)]++;

        // Calculate cumulative frequency
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Place the elements in sorted order
        for (int i = n - 1; i >= 0; i--) {
            output[count[abs((a[i] / place) % 10)] - 1] = a[i];
            count[abs((a[i] / place) % 10)]--;
        }

        for (int i = 0; i < n; i++)
            a[i] = output[i];
    }

    // function to implement radix sort
    public void radixsort(int a[], int n) {

        // get maximum element from array
        int max = getMax(a, n);

        // Apply counting sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(a, n, place);
    }
}




