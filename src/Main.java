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
                7886650, 1914408, 2954956, 9216623, 2078174,
                7202816, 9226855, 7540154, 9513624, 3973864,
                8857197, 4071581, 7150315, 6880408, 1819981,
                4636181, 7025552, 9391725, 7711672, 4874282,
                8733168, 4834974, 8885896, 8016574, 2943799,
                3414981, 6366385, 3655352, 5732106, 4179630
        };
        Heapsort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        System.out.println(Arrays.toString(sortedNumber));
    }
}