package br.com.letscode.java.algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 23, 4, 36, 48, 63, 2, 0, 12, 56};

        System.out.println("Array desordenado:");
        for (int k : array) {
            System.out.println(k);
        }

        //Bubble sort
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }

        }

        System.out.println("Array ordenado:");
        for (int j : array) {
            System.out.println(j);
        }

    }
}
