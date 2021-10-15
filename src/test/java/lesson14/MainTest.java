package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void arrayAfterLastFour1() {
        Assertions.assertArrayEquals(new int[]{1, 7}, Main.arrayAfterLastFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    void arrayAfterLastFour2() {
        Assertions.assertArrayEquals(new int[]{}, Main.arrayAfterLastFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 4}));
    }

    @Test
    void arrayAfterLastFour3() {
        Assertions.assertArrayEquals(new int[]{1, 2, 0, 5, 2, 3, 8, 1, 7}, Main.arrayAfterLastFour(new int[]{4, 1, 2, 0, 5, 2, 3, 8, 1, 7}));
    }

    @Test
    void arrayAfterLastFour4() {
        Assertions.assertThrows(RuntimeException.class, () -> Main.arrayAfterLastFour(new int[]{1, 2, 2, 3, 1, 0}));
    }

    @Test
    void arrayAfterLastFour5() {
        Assertions.assertThrows(RuntimeException.class, () -> Main.arrayAfterLastFour(new int[]{}));
    }

    @Test
    void contains1And4_1() {
        Assertions.assertEquals(true, Main.contains1And4(new int[]{4, 1, 1, 4, 1, 4, 1, 4, 1, 1}));
    }

    @Test
    void contains1And4_2() {
        Assertions.assertEquals(false, Main.contains1And4(new int[]{4, 1, 1, 4, 1, 4, 3, 4, 1, 1}));
    }

    @Test
    void contains1And4_3() {
        Assertions.assertEquals(false, Main.contains1And4(new int[]{4, 4, 4, 4, 4}));
    }

    @Test
    void contains1And4_4() {
        Assertions.assertEquals(false, Main.contains1And4(new int[]{1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void contains1And4_5() {
        Assertions.assertEquals(false, Main.contains1And4(new int[]{}));
    }

    @Test
    void find4_1() {
        Assertions.assertEquals(6, Main.find4(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    void find4_2() {
        Assertions.assertEquals(0, Main.find4(new int[]{4, 2, 6, 3, 2, 3, 8, 1, 7}));
    }

    @Test
    void find4_3() {
        Assertions.assertEquals(8, Main.find4(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 4}));
    }

    @Test
    void find4_4() {
        Assertions.assertEquals(-1, Main.find4(new int[]{}));
    }

    @Test
    void find4_5() {
        Assertions.assertEquals(-1, Main.find4(new int[]{1, 2, 5, 3, 2, 3, 8, 1, 9}));
    }
}