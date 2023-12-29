package hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @ParameterizedTest
    @DisplayName("Проверка нечетных чисел")
    @ValueSource(ints = { 1, 3, 5 })
    void oddNumber(int num) {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.evenOddNumber(num));
    }

    @ParameterizedTest
    @DisplayName("Проверка четных чисел")
    @ValueSource(ints = { 2, 4, 6 })
    void evenNumber(int num) {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(num));
    }

    @ParameterizedTest
    @DisplayName("Число в интервале (25;100)")
    @ValueSource(ints = { 26, 40, 70 })
    void numberInInterval(int num) {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.numberInInterval(num));
    }

    @ParameterizedTest
    @DisplayName("Число не в интервале (25;100)")
    @ValueSource(ints = { 2, 440, 120 })
    void numberNotInInterval(int num) {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(num));
    }
}