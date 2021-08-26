package br.com.letscode.java.algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main (String [] args) {
        int[] array = {10, 23, 4, 36, 48, 63, 2, 0, 12, 56};
        int[] temp = new int[array.length];

        System.out.println("Array desordenado: " + Arrays.toString(array));
        mergeSort(array, temp, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));

        }

        public static void mergeSort ( int[] array, int[] temp, int inicio, int fim){
            if (inicio < fim) {
                int meio = (inicio + fim) / 2;
                mergeSort(array, temp, inicio, meio);
                mergeSort(array, temp,meio + 1, fim);
                sort(array, temp, inicio, meio, fim);

            }
        }

        public static void sort (int [] array, int [] temp, int inicio, int meio, int fim){
            if (fim + 1 - inicio >= 0) System.arraycopy(array, inicio, temp, inicio, fim + 1 - inicio);

        int i = inicio;
        int j = meio + 1;

        for (int k = inicio; k <= fim; k++){
            if (i > meio){
                array[k] = temp [j++];
            } else if (j>fim){
                array[k] = temp[i++];
            } else if (temp[i] < temp[j]){
                array[k] = temp[i++];
            } else {
                array[k] = temp[j++];
            }
        }
    }
}

