package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Solution38Test {

    @Test
    @DisplayName("Testing filterEvenNumbers()")
    void solutionTest1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(4);
        Assertions.assertEquals(list2,Solution38.filterEvenNumbers(list));
    }

}