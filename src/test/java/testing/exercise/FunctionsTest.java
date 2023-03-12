package testing.exercise;

import com.exercise1.MyLimitedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FunctionsTest {
    @Test
    void test_check_that_fuction_getItem_is_correct() {
        MyLimitedList<Integer> int_list = new MyLimitedList<>(3);
        int_list.addItem(1);
        int_list.addItem(5);
        int_list.addItem(6);

        int expected = 6;
        Number actual = int_list.getItem(2);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_check_that_fuction_removeFirstItem_is_correct() {
        MyLimitedList<Integer> int_list = new MyLimitedList<>(3);
        int_list.addItem(1);
        int_list.addItem(5);
        int_list.addItem(6);
        int_list.addItem(8);

        int expected = 5;
        Number actual = int_list.getItem(0);

        Assertions.assertEquals(expected, actual);
    }
}
