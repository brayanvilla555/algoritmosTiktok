package listas.simpleUnaReferencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista listaUno = new Lista();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            listaUno.agregarAlInicio(scanner.next());
        }

        listaUno.eliminarNodoBuscado("2");

        listaUno.gellAll();

        System.out.println();
        System.out.print("Nº nodos: "+listaUno.getLength());

    }
}
