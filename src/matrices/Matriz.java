package matrices;

import java.util.Scanner;

public class Matriz {
    public Integer[][] elementos;

    public Matriz(int filas, int columnas){

        elementos = new Integer[filas][columnas];
    }

    public Matriz(){
    }
    //CREAR UNA MATRIZ
    //https://www.tiktok.com/@practicetec/video/7293521157930700038
    public Integer[][] rellenar(Scanner scanner){
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                elementos[i][j] = scanner.nextInt();
            }
        }
        return elementos;
    }

    //MOSTRAR UNA MATRIZ
    public void mostrar(){
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                System.out.print(elementos[i][j] + " ");
            }
            System.out.println();
        }
    }

    //SUMAR DOS MATRICES
    //https://www.tiktok.com/@practicetec/video/7294250530287717637
    public void suma(Integer[][] A){
        Integer[][] resultado = new Integer[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                resultado[i][j] = this.elementos[i][j] + A[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

}











