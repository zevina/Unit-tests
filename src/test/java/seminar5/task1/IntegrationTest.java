package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegrationTest {
    private NumberGenerator numberGenerator = new NumberGenerator();
    private MaxNumberFinder maxNumberFinder = new MaxNumberFinder();

    @Test
    void findMaxNumber() {
        List<Integer> nums = numberGenerator.generateRandomNumbers(5, 1, 10);
        Integer maxNum = maxNumberFinder.findMaxNumber(nums);
        Integer maxList = Collections.max(nums);
        assertNotNull(maxNum);
        assertTrue(1 <= Collections.min(nums));
        assertTrue(10 >= Collections.max(nums));
        assertEquals(maxList, maxNum);
    }


}
