package herencia;

public class Perro extends Animal {
    public int edad;
    public String colorDeOjos;

    @Override
    public void AnimalSonido(){
        System.out.println("WAU WAU WAU");
    };
}
