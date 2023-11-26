package recurcividad;

public class Main {

    //RECURCIBIDAD
    //https://www.tiktok.com/@practicetec/video/7276513226613902598
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int numero){
        if(numero == 0){
            return 1;
        }else{
            return factorial(numero-1) * numero;
        }
    }
}
