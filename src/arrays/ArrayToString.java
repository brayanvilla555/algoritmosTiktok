package arrays;
import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] nombre = new String[10];
        System.out.println("Nùmeros de elementos: "+nombre.length);

        int[] numbers = {4, 7, 2, 8, 1};
        System.out.println("Nùmeros de elementos: "+numbers.length);
        System.out.println("Array original: " + Arrays.toString(numbers));
    }
}
