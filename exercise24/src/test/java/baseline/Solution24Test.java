package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Solution24Test {

    @Test
    @DisplayName("Testing isAnagram() when two anagrams are passed.")
    void solutionTest1() {
        Assertions.assertEquals(true,baseline.Solution24.isAnagram("dog","god"));
    }

    @Test
    @DisplayName("Testing isAnagram() when two non-anagrams are passed.")
    void solutionTest2() {
        Assertions.assertEquals(false,baseline.Solution24.isAnagram("dog","hello"));
    }

    @Test
    @DisplayName("Testing isAnagram() when two anagrams with different capitalization are passed.")
     void solutionTest3() {
        Assertions.assertEquals(true,baseline.Solution24.isAnagram("dog","GoD"));
    }


}