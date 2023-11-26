package polimorfismo;

public class Main {
    //POLIMORFISMO
    //https://www.tiktok.com/@practicetec/video/7282012132693167366
    public static void main(String[] args) {
        Animal perroUno = new Perro();
        Animal gatoUno = new Gato();

        perroUno.AnimalSonido();
        gatoUno.AnimalSonido();
    }
}
