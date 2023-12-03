package ordenamiento;

import java.util.Arrays;

public class Seleccion {
    public static void main(String[] args) {
        int [] edades = {7, 85, 3, 6 ,90, 45, 60, 1,7};

        for (int i = 0; i < edades.length-1; i++) {
            int menor = edades[i];
            int pos = i;
            for (int j = i+1; j < edades.length; j++) {
                if(edades[j] < menor){
                    menor = edades[j];
                    pos = j;
                }
            }
            edades[pos] = edades[i];
            edades[i] = menor;
        }

        System.out.println(Arrays.toString(edades));
    }
}
