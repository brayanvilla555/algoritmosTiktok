package arrays;

import java.util.Arrays;

public class ArrayBinarySearch {

    //Busqueda binaria en un array
    //https://www.tiktok.com/@practicetec/video/7292038399458954501
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 8};
        int buscando = 100;
        int index = Arrays.binarySearch(numbers, buscando);

        if (index >= 0) {
            System.out.println("Elemento " + buscando + " encontrado en el índice: " + index);
        } else {
            System.out.println("Elemento " + buscando + " no encontrado en el array.");
        }
    }
}
