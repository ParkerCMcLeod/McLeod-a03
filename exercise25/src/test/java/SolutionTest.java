package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import javax.management.ConstructorParameters;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    @DisplayName("Testing very weak password")
    void solutionTest1() {
        Assertions.assertEquals(1,baseline.Solution25.passwordValidator("12345"));
    }

    @Test
    @DisplayName("Testing weak password")
    void solutionTest2() {
        Assertions.assertEquals(2,baseline.Solution25.passwordValidator("abcdef"));
    }

    @Test
    @DisplayName("Testing very strong password")
    void solutionTest3() {
        Assertions.assertEquals(3,baseline.Solution25.passwordValidator("abc123xyz"));
    }

    @Test
    @DisplayName("Testing very strong password")
    void solutionTest4() {
        Assertions.assertEquals(4,baseline.Solution25.passwordValidator("1337h@xor!"));
    }

}