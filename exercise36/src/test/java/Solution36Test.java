package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Solution36Test {

    @Test
    @DisplayName("Testing isValid()")
    void solutionTest1() {
        Assertions.assertEquals(1,Solution36.isValid("0"));
        Assertions.assertEquals(0,Solution36.isValid("ABC"));
        Assertions.assertEquals(0,Solution36.isValid("12..1"));
        Assertions.assertEquals(1,Solution36.isValid("12.1"));
        Assertions.assertEquals(1,Solution36.isValid("4"));
    }

    @Test
    @DisplayName("Testing average()")
    void solutionTest2() {
        ArrayList<Double> numArray = new ArrayList<>();
        numArray.add(1.0);
        numArray.add(2.0);
        numArray.add(3.0);
        Assertions.assertEquals(2,Solution36.average(numArray));
    }

    @Test
    @DisplayName("Testing min()")
    void solutionTest3() {
        ArrayList<Double> numArray = new ArrayList<>();
        numArray.add(1.0);
        numArray.add(2.0);
        numArray.add(3.0);
        Assertions.assertEquals(3,Solution36.min(numArray));
    }

    @Test
    @DisplayName("Testing max()")
    void solutionTest4() {
        ArrayList<Double> numArray = new ArrayList<>();
        numArray.add(1.0);
        numArray.add(2.0);
        numArray.add(3.0);
        Assertions.assertEquals(1,Solution36.max(numArray));
    }

    @Test
    @DisplayName("Testing standardDeviation()")
    void solutionTest5() {
        ArrayList<Double> numArray = new ArrayList<>();
        numArray.add(1.0);
        numArray.add(2.0);
        numArray.add(3.0);
        Assertions.assertEquals(.816496580927726,Solution36.standardDeviation(numArray));
    }

}