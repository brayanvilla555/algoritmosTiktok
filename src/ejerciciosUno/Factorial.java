package ejerciciosUno;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Calcular el factorial de un número
        // 4! = 4*3*2*1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el volor: ");
        int valor = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= valor ; i++) {
            System.out.println(factorial + "*" + i);
            factorial = factorial * i;
        }

        System.out.println("El factorial es: "+factorial);
    }
}
