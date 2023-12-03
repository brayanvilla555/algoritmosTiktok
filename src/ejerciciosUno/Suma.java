package ejerciciosUno;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        //Hacer una suma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
        float valorUno = scanner.nextFloat();
        System.out.println("Ingresa el segun valor: ");
        float valorDos = scanner.nextFloat();
        // suma +; resta -; divición /; mult * ; módulo %

        System.out.println("la suma es: "+ (float) (valorUno+valorDos) );
    }
}
