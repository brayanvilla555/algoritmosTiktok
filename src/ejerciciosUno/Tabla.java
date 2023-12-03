package ejerciciosUno;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        //Tabla de multiplicar
        Scanner scanner = new Scanner(System.in);
        //int multiplicador = scanner.nextInt();

        //Multiplicado * multiplicador = producto
        /*
        1 * 1 = 1
        1 * 2 = 2
        ...
        1 + 12 = 12

        2 * 1 = 2
        2 * 2 = 4
        ...
        2 + 12 = 24
        for (int i = 0; i <= 12; i++) {
            System.out.println(multiplicador+"*"+i +
                    " = "+(int)(i*multiplicador));
        }
        */


        //Mostrar la tabla completa
        for (int i = 1; i <= 12; i++) {
            System.out.println("==========");
            for (int j = 1; j <= 12; j++) {
                System.out.println(j+"*"+i + " = "+(int)(i*j));
            }
        }
    }
}
