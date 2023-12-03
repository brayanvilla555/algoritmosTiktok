package ejerciciosUno;


import java.util.Arrays;
import java.util.Random;

public class ArrayUno {
    public static void main(String[] args) {
        //Hallar el mayor valor de un array
        Random random = new Random();
        int [] edades = new int[10];

        for (int i = 0; i < edades.length; i++) {
            edades[i]  = random.nextInt(1, 100);
        }

        System.out.println(Arrays.toString(edades));

        // [20-15-40-100]
        int maximo = edades[0];
        for (int i = 0; i < edades.length ; i++) {
            if(edades[i] > maximo){
                maximo = edades[i];
            }

        }

        System.out.println("El máximo valor: " + maximo);
        
    }
}
