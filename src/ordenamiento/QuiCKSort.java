package ordenamiento;

public class QuiCKSort {

    public static void main(String[] args) {
        int []edades =  { 10, 40, 8, 80, 55, 20};
    }

    public static void ordenar(int[] edades,int izquierda, int derecha){

        int i = 0;
        int j = 0;

        int pivote =  edades[(izquierda + derecha)/2];

        do{
            while (edades[i] < pivote)
                i++;
            while (edades[j] > pivote)
                i--;

            if(i <= j){
                int auxillar = edades[i];
                edades[i] = edades[j];
                edades[j] = auxillar;
                i++;
                j--;
            }
        }while(i <= j);
        if(izquierda < j)
            ordenar(edades, izquierda, j) ;

        if(i < derecha)
            ordenar(edades, i, derecha) ;

    }

}
