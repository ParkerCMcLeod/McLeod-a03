package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Solution27Test {

    @Test
    @DisplayName("Test first name inputs")
    void solutionTest1() {
        Assertions.assertEquals(0,Solution27.validateFirstName("John"));
        Assertions.assertEquals(1,Solution27.validateFirstName("J"));
        Assertions.assertEquals(1,Solution27.validateFirstName(""));
    }
    @Test
    @DisplayName("Test last name inputs")
    void solutionTest2() {
        Assertions.assertEquals(0,Solution27.validateLastName("John"));
        Assertions.assertEquals(1,Solution27.validateLastName("J"));
        Assertions.assertEquals(1,Solution27.validateLastName(""));
    }
    @Test
    @DisplayName("Test ID inputs")
    void solutionTest3() {
        Assertions.assertEquals(0,Solution27.validateID("AA-1234"));
        Assertions.assertEquals(1,Solution27.validateID("A12-1234"));
    }
    @Test
    @DisplayName("Test ZIP inputs")
    void solutionTest4() {
        Assertions.assertEquals(0,Solution27.validateZip("32259"));
        Assertions.assertEquals(1,Solution27.validateZip("ABCDE"));
        Assertions.assertEquals(1,Solution27.validateZip("351699"));
    }


}