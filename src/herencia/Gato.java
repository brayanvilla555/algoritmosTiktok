package herencia;

public class Gato extends Animal {
    public String colorCabello;
    public String colorDeOjos;

    @Override
    public void AnimalSonido(){
        System.out.println("MIAU MIAU MIAU MIAU....");
    };
}
