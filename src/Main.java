import java.lang.reflect.Array;
import java.util.Arrays;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,1,2,5,3,6,0,7};

        InsertionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        System.out.println(Arrays.toString(sortedNumber));
    }
}