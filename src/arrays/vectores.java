package arrays;

import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //LOS ARREGLOS O LOS VECTORES
        //https://www.tiktok.com/@practicetec/video/7287986937204395270
        /*
        String [] nombres = {"Brayan", "Naye", "Diego", "Ester"};
        String  apellidos[] = {"Villanueva", "Quispe", "Romero", "Reyes"};

        System.out.println(nombres[0].concat(" ").concat(apellidos[0]));
        System.out.println(nombres[1].concat(" ").concat(apellidos[1]));
        System.out.println(nombres[2]+ " " +(apellidos[2]));
        System.out.println(nombres[3]+ " " +(apellidos[3]));
        */

        //REGLLENAR UN ARREGLO
        //https://www.tiktok.com/@practicetec/video/7288342637470387462
        Integer [] numbers = new Integer[5];
        //numbers[0] = 1;
        //numbers[1] = 2;

        //INGRESAR VALORES AUN ARREGLO POR TECLADO
        //https://www.tiktok.com/@practicetec/video/7289031369676688645
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingresa el valor de la posición " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        //MOSTRAR LOS VALORES DEL AREGLO
        System.out.println("Mostrar los elementos del array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

            }
}
