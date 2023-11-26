package arrays;

import java.util.Arrays;

public class ArrayFill {

    //ASIGNAR UN VALOR A LOS ARRAYS
    //https://www.tiktok.com/@practicetec/video/7291296079922875654
    public static void main(String[] args) {
        int[] numbers = new int[100];
        /*numbers[0] = 42;
        numbers[1] = 42;
        numbers[2] = 42;
        numbers[3] = 42;
        numbers[4] = 42;*/
        Arrays.fill(numbers, 42);
        System.out.println(Arrays.toString(numbers));
    }
}
