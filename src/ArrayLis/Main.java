package ArrayLis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        //creamos la lista
        List<Persona> personas = new ArrayList<>();

        Persona persona1 = new Persona("Brayan");
        Persona persona2 = new Persona("Diego", "Villanueva", date);
        Persona persona3 = new Persona();

        //agregar una persona a la lista
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);


        //mostrar un elemento de la lista
        //personas.get(indice);
        /*
        System.out.println(personas.get(0));
        System.out.println(personas.get(1));
        System.out.println(personas.get(2));
        */


        //saber la cantidad de elementos
        //personas.size();
        System.out.println(personas.size());

        //recorrer una lista
        for (int i = 0; i < personas.size(); i++) {
            //System.out.println(personas.get(i));
        }

        for(Persona persona : personas){
            //System.out.println(persona);
        }


        //modificar un elemento, utilice el set()método y consulte el número de índice:
        Persona persona4 = new Persona("Naye");
        personas.set(0, persona4);
        System.out.println(personas.get(0));


        //eliminar un elemento
        //personas.remove(indice);
        personas.remove(2);
        System.out.println(personas.get(2));


        //Eliminar todos los elementos de la lista
        //personas.clear();
    }
}
