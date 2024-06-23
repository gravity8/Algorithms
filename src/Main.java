import java.lang.reflect.Array;
import java.util.Arrays;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {
                7823103, 2599204, 5025540, 2445778, 8150029,
                1570884, 1940769, 5182084, 1872714, 1514868,
                9660545, 9088178, 8707424, 7057158, 7996732,
                3113492, 9357167, 5588714, 1645557, 4157213,
                7886650, 1914408
        };
        Heapsort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        System.out.println(Arrays.toString(sortedNumber));
    }
}