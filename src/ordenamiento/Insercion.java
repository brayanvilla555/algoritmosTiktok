package ordenamiento;

import java.util.Arrays;

public class Insercion {
    public static void main(String[] args) {
        Integer [] edades = {20, 50, 30, 12, 21, 56,8};

        for (int i = 1; i < edades.length; i++) {
            int auxillar = edades[i];
            int j = i-1;
            while (j >= 0 && edades[j] > auxillar){
                edades[j+1] = edades[j];
                j--;
            }
            edades[j+1] = auxillar;
        }

        System.out.println(Arrays.toString(edades));
    }
}
