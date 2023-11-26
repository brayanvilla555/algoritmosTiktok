package arrays;

import java.util.Arrays;

public class ArrayCopyOf {

    //HACER UNA COPIA DE UN ARRARY
    //https://www.tiktok.com/@practicetec/video/7291664375738289413
    public static void main(String[] args) {
        int[] originalArray = {4, 7, 2, 8, 1};
        System.out.println("Array original: " + Arrays.toString(originalArray));

        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copia: " + Arrays.toString(copiedArray));
    }
}
