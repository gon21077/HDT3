import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Prueba unitaria para Gnomesort
 * @author Pedro Javier Marroquín Abrego 21801
 * @since 09/02/2022
 * @version 1.0
 */
public class SortsTest {
    

    @Test
    /**
     * prueba que el método ordene los números
     */
    public void testGnomesort()
    {
        GnomeSort gs = new GnomeSort();
        int[] numbers = {1,9,3,2,5,4,8,6,7};
        int[] ordered = {1,2,3,4,5,6,7,8,9};
        gs.gnomeSort(numbers, 9);
        for (int i = 0; i<9; i++)
        {
            assertEquals(ordered[i], numbers[i]);
        }
    }
    @Test
    /**
     * prueba el ordenamiento de MergeSort
     */
    public void testMergeSort()
    {
        mergeSort merge = new mergeSort();
        int[] numbers = {1,9,3,2,5,4,8,6,7};
        int[] ordered = {1,2,3,4,5,6,7,8,9};
        merge.sort(numbers, 0, numbers.length-1);
        for (int i = 0; i<9; i++)
        {
            assertEquals(ordered[i], numbers[i]);
        }
    }

    @Test
    /**
     * prueba que Quicksort ordene correctamente
     */
    public void testQuickSort()
    {
        QuickSort quick = new QuickSort();
        int[] numbers = {1,9,3,2,5,4,8,6,7};
        int[] ordered = {1,2,3,4,5,6,7,8,9};
        quick.quickSort(numbers, 0, numbers.length-1);
        for (int i = 0; i<9; i++)
        {
            assertEquals(ordered[i], numbers[i]);
        }
    }

    @Test
    /**
     * prueba para verificar ordenamiento de RadixSort
     */
    public void testRadixSort()
    {
        RadixSort rd = new RadixSort();
        int[] numbers = {1,9,3,2,5,4,8,6,7};
        int[] ordered = {1,2,3,4,5,6,7,8,9};
        rd.radixsort(numbers, numbers.length);
        for (int i = 0; i<9; i++)
        {
            assertEquals(ordered[i], numbers[i]);
        }
    }

    @Test
    /**
     * prueba para verificar ordenamiento de BubbleSort
     */
    public void testBubbleSort()
    {
        BubbleSort bb = new BubbleSort();
        int[] numbers = {1,9,3,2,5,4,8,6,7};
        int[] ordered = {1,2,3,4,5,6,7,8,9};
        bb.bubbleSort(numbers);
        for (int i = 0; i<9; i++)
        {
            assertEquals(ordered[i], numbers[i]);
        }
    }
}
