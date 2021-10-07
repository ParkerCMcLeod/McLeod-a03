package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Solution39Test {

    @Test
    @DisplayName("Testing isValid()")
    void solutionTest1() {
        Record record = new Record("John", "Johnson", "Manager", "2016-12-31");
        Assertions.assertEquals("John",record.firstName);
        Assertions.assertEquals("Johnson",record.lastName);
        Assertions.assertEquals("Manager",record.department);
        Assertions.assertEquals("2016-12-31",record.seperationDate);
        Assertions.assertEquals(1,record.numRecords);
    }

}