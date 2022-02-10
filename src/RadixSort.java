import java.io.*;
import java.util.*;
import java.lang.Integer;
public class RadixSort {
    /**
     * Metodo de ayuda al tipo "merge sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     // @param list array con los elementos a ordenar
     // @param lo elemento inicial
     //@param hi ultimo elemento del array
     */
    public void merge(int list[],int l,int m,int r){
        int n1 = m-l +1;
        int n2 = r - m;

        int left[] = new int[n1]; //crear arrays temporales
        int right[] = new int[n2];
        //copiar los objetos originales
        for (int i=0;i<n1;i++){
            left[i] = list[l+i];
        }
        for (int j=0;j<n2;j++){
            right[j] = list[m + 1 + j];
        }
        //unir
        int i = 0;
        int j = 0;
        int k = l;
        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                list[k]=left[i];
                i++;
            } else {
                list[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            list[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            list[k] = right[j];
            j++;
            k++;
        }
    }
 /**
     * Metodo para sortear con el tipo "radix sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet" y de https://www.geeksforgeeks.org/radix-sort/
     * @param list array con los elementos a ordenar
     */
    public void radixSort (int[] list){
        int m = getMax(list);
        for (int e = 1;m/e>0;e*=10){
            countSort(list, e);
        }
    }

   

    /**
     * Metodo de apoyo para el "radix sort"
     * Obtiene el valor maximo en un array
     * Obtenido y modificado a partir de https://www.geeksforgeeks.org/radix-sort/
     * @param list array del que se quiere saber el valor maximo
     */
    public int getMax (int[] list){
        int max = list[0];
        for (int i =1;i<list.length;i++){
            if (list[i]>max){
                max = list[i];
            }
        }
        return max;
    }

}



