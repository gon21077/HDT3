/**
 * Main
 * Objetivo: Intermediar todas las acciones
 *
 * @author Juan Gonzalez Campo
 * @author Paulo Sánchez
 * @author Pedro Marroquin
 * @version 1.0 finalizado 09/02/2022
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Controlador contro =  new Controlador();
        Random rand = new Random();
        boolean on = true;
        while(on){
            int numero = 0;
            boolean entradaIncorrecta = true;
            while(entradaIncorrecta)
            {
                System.out.println("Ingrese cantidad de numeros a sortear");
                String eleccion = scan.nextLine();
                if(contro.verificarInt(eleccion))
                {
                    numero = Integer.parseInt(eleccion);
                    entradaIncorrecta = false;
                }
            }
            int arr[] = new int[numero];
            for (int i = 0; i < numero; i++) {
                arr[i] = abs(rand.nextInt());
            }
            System.out.println("Seleccione tipo de sort: \n1. GnomeSort \n2. Merge sort \n3. Quick sort \n4. Radix sort \n5. Bubble sort\n Si desea salir ingrese 0");
            String op = scan.nextLine();
            switch (op) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    int arr1[] = new int[numero];
                    GnomeSort gs = new GnomeSort();
                    gs.gnomeSort(arr, arr.length);
                    contro.imprimirArray(arr);
                    break;
                case "2":
                    mergeSort ms = new mergeSort();
                    ms.sort(arr, 0, arr.length - 1);
                    contro.imprimirArray(arr);
                    break;
                case "3":
                    QuickSort qs = new QuickSort();
                    qs.quickSort(arr, 0, arr.length - 1);
                    contro.imprimirArray(arr);
                    break;
                case "4":
                    RadixSort rs = new RadixSort();
                    rs.radixsort(arr, arr.length);
                    contro.imprimirArray(arr);
                    break;
                case "5":
                    BubbleSort bs = new BubbleSort();
                    bs.bubbleSort(arr);
                    contro.imprimirArray(arr);
                    break;
                default:
                    System.out.println("Ingrese de  1 a 5");
                    break;
            }
        }
    }
}
