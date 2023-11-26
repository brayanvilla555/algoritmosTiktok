package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
        //crear dos matrices o arrays multidimencionales
        //https://www.tiktok.com/@practicetec/video/7292385305326324997

        String [][] nombres = { {"Brayan", "Diego", "Julio"}, {"Sara", "Nayeli", "Sey"}};
        int [][] numeros = {{0,1,2,3,4,5,6,7,8,9}, {11,12,13,14,15}};

        System.out.println(nombres[0][2]);
        System.out.println(nombres[1][1]);

        System.out.println();

        System.out.println(numeros[0][0]);
        System.out.println(numeros[1][0]);

         */

        /*Comparar dos matrices multidimencionales*/
        //https://www.tiktok.com/@practicetec/video/7295757430267432198
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix3 = {{4, 3}, {2, 1}};

        boolean isEqual = Arrays.deepEquals(matrix1, matrix2);
        System.out.println("¿Son iguales 1 y 2? " + isEqual);

        isEqual = Arrays.deepEquals(matrix1, matrix3);
        System.out.println("¿Son iguales 1 y 3? " + isEqual);

        //convertir un arrar multidimencional en String
        //https://www.tiktok.com/@practicetec/video/7295030036808174853

        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrix3));

        /*
        //sumar dos matrices y los valores almacenar en una tecera
        //https://www.tiktok.com/@practicetec/video/7294250530287717637

        Scanner scanner = new Scanner(System.in);

        Matriz matrizUno = new Matriz(3,3);
        matrizUno.rellenar(scanner);
        matrizUno.mostrar();

        Matriz matrizDos = new Matriz(3,3);
        matrizDos.rellenar(scanner);
        matrizDos.mostrar();

        System.out.println();

        matrizUno.suma(matrizDos.elementos);

        */

    }
}
