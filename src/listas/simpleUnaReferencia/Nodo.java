package listas.simpleUnaReferencia;
//entender que es una lista y un nodo
//https://www.tiktok.com/@practicetec/video/7298346183456591109
public class Nodo {
    private String elemento;
    private Nodo siguiente;

    public Nodo(String elemento, Nodo siguiente){
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public Nodo(String elemento){
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Nodo(){
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
