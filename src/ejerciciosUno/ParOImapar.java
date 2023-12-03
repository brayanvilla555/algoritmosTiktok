package ejerciciosUno;

import java.util.Scanner;

public class ParOImapar {
    public static void main(String[] args) {
        //Verificación de número par/impar
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor: ");
        int numero = scanner.nextInt();

        //El módulo %
        if(numero % 2 == 0){
            System.out.println("El número "+ numero + " es par");
        }else {
            System.out.println("El número "+ numero + " es impar");
        }

    }
}
