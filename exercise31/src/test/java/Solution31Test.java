package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Solution29Test {

    @Test
    @DisplayName("Testing isValid()")
    void solutionTest1() {
        Assertions.assertEquals(0,Solution31.isValid("0"));
        Assertions.assertEquals(0,Solution31.isValid("ABC"));
        Assertions.assertEquals(0,Solution31.isValid("12..1"));
        Assertions.assertEquals(1,Solution31.isValid("12.1"));
        Assertions.assertEquals(1,Solution31.isValid("4"));
    }

}