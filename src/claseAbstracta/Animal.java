package claseAbstracta;
//CLASE ABSTRACTA
//https://www.tiktok.com/@practicetec/video/7282745452393434373
public abstract class Animal {
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

    //METODO ABSTRACTO
    //https://www.tiktok.com/@practicetec/video/7283900051980700933
    public abstract void prueba();

    public void hola(){
        System.out.println("Hola mundo");
    }
}
