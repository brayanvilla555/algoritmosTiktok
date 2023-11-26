package herencia;

public class Animal {
    private String raza;
    private String nombre;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void AnimalSonido(){
        System.out.println("..................");
    };

    public void hola(){
        System.out.println("Hola mundo");
    }
}
