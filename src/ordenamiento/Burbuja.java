package ordenamiento;

import java.util.Arrays;

public class Burbuja {
    public static void main(String[] args) {

        Integer [] edades = {10, 6, 9, 23, 50,7};

        for (int i = 1; i < edades.length; i++) {
            for (int j = 0; j < (edades.length-1); j++) {
                if(edades[j] > edades[j+1]){
                    Integer auxillar = edades[j];
                    edades[j] =edades[j+1];
                    edades[j+1] = auxillar;
                }
            }
        }

        System.out.println(Arrays.toString(edades));
    }
}
