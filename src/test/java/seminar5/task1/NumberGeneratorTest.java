package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {
    private NumberGenerator numberGenerator = new NumberGenerator();

    @Test
    void generateRandomNumbers() {
        List<Integer> nums = numberGenerator.generateRandomNumbers(5, 1, 10);
        assertEquals(5, nums.size());
        assertTrue(1 <= Collections.min(nums));
        assertTrue(10 >= Collections.max(nums));
    }
}