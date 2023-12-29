package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {
    private MaxNumberFinder maxNumberFinder = new MaxNumberFinder();

    @Test
    void findMaxNumber() {
        Integer maxNum = maxNumberFinder.findMaxNumber(List.of(1,2,5));
        assertNotNull(maxNum);
        assertEquals(5, maxNum);
    }
}