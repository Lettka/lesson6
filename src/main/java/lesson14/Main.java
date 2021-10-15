package lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
    public static final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayAfterLastFour(new int[]{4, 1, 2, 0, 5, 2, 3, 8, 1, 7})));
        System.out.println(contains1And4(new int[]{}));
        System.out.println(true && true);

    }

    public static int[] arrayAfterLastFour(int[] array) {
        int[] result;
        int index4 = find4(array);
        if (index4 >= 0) {
            result = new int[array.length - index4 - 1];
            for (int i = 0; i < result.length; i++) {
                result[i] = array[i + index4 + 1];
            }
        } else {
            log.info("RuntimeException");
            throw new RuntimeException();
        }
        return result;
    }

    public static int find4(int[] array) {
        int index = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean contains1And4(int[] array) {
        boolean contains1 = false;
        boolean contains4 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) return false;
            if (array[i] == 1) contains1 = true;
            if (array[i] == 4) contains4 = true;
        }
        return contains1 && contains4;
    }

}
