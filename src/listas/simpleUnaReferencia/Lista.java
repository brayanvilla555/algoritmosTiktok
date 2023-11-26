package listas.simpleUnaReferencia;

public class Lista {
    private Nodo inicio;

    //contador
    //https://www.tiktok.com/@practicetec/video/7302812478126247173
    private int length;

    public Lista(){
        this.length = 0;
    }


    public int getLength() {
        return length;
    }


    //Crear el primer nodo
    //https://www.tiktok.com/@practicetec/video/7298714391028059398
    public void agregarPrimerElement(String elemento){

        Nodo nuevo = new Nodo(elemento);
        inicio = nuevo;

        this.length++;
    }

    //Agregar nodos al inicio
    /*
    https://www.tiktok.com/@practicetec/video/7299078309810375941
    ingreso
    1
    2
    3
    4
    guardar
    4
    3
    2
    1
    */
    public void agregarAlInicio(String elemento){
        Nodo nuevo = new Nodo(elemento, this.inicio);
        //nuevo.setSiguiente(this.inicio);
        inicio = nuevo;
        this.length++;
    }

    //Agregar nodos al fina
    /*
    https://www.tiktok.com/@practicetec/video/7301385587611766022
    ingreso
    1
    2
    4
    3
    guardar
    1
    2
    3
    4
    */

    public void agregarAlFinal(String elemento ){
        if(inicio == null){
            agregarPrimerElement(elemento);
        }else{

            Nodo anterior = inicio;

            while (anterior.getSiguiente() != null){
                anterior = anterior.getSiguiente();
            }

            Nodo nuevo = new Nodo(elemento);

            anterior.setSiguiente(nuevo);
            this.length ++;
        }
    }

    //mètodo para crear un nodo a continuacion de cualquier nodo
    public void agregarNodoAcontinuacionDeOtro(String search,String elemento){
        if(inicio == null && elemento.equals(search)){
            agregarPrimerElement(elemento);
        }else if(inicio != null){

            Nodo actual = inicio;

            while (actual != null){

                if(actual.getElemento().equals(search)){
                    Nodo nuevo = new Nodo(elemento, actual.getSiguiente());
                    //nuevo.setSiguiente(anteriro.getSiguiente());
                    actual.setSiguiente(nuevo);
                    length ++;
                    return;
                }

                actual = actual.getSiguiente();
            }
        }else{
            System.out.println("No se pudo crear el nodo");
        }
    }

    //mètodo para eliminar un nodo de cualquier lugar
    public void eliminarNodoBuscado(String search){
        if (inicio == null) {
            System.out.println("Lista vacía");
            return;
        }

        if (inicio.getElemento().equals(search)) {
            // Eliminar el primer nodo si es el que buscamos
            inicio = inicio.getSiguiente();
            length--;
            return;
        }

        Nodo actual = inicio;

        while (actual.getSiguiente() != null && !actual.getSiguiente().getElemento().equals(search)) {
            // Avanzar hasta el nodo anterior al que queremos eliminar
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            // Eliminar el nodo
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            length--;
        } else {
            System.out.println("El nodo con el valor '" + search + "' no fue encontrado");
        }
    }
    //mostrar la lista enlazada simple
    //https://www.tiktok.com/@practicetec/video/7299830519389359366
    public void gellAll(){
        Nodo auxillar = inicio;
        while (auxillar != null){
            System.out.print(auxillar.getElemento() + "--->");
            auxillar = auxillar.getSiguiente();
        }
    }

    //eliminar toda la lista
    //https://www.tiktok.com/@practicetec/video/7300199626186050822
    public void eliminarLista(){
        inicio = null;
        this.length = 0;
    }

    //eliminar el primer nodo
    //https://www.tiktok.com/@practicetec/video/7302054363818659078
    public void eliminarPrimerElemento(){

        inicio = inicio.getSiguiente();
        this.length--;
    }

    //eliminar el nodo final
    //https://www.tiktok.com/@practicetec/video/7302423848291454214
    public String eliminarFinal(){

        Nodo anteriror = inicio;

        while (anteriror.getSiguiente().getSiguiente() != null){
            anteriror = anteriror.getSiguiente();
        }


        Nodo retorno = anteriror.getSiguiente();

        anteriror.setSiguiente(null);

        this.length--;

        return retorno.getElemento();
    }
}
