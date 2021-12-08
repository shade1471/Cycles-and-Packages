package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'there are values in range',200,300,3",
            "'boundary value for minValue',100,120,1",
            "'boundary value for maxValue',9605,9801,1",
            "'small range values before minValue',1,99,0",
            "'large range values after maxValue',9802,10000,0",
            "'no values in range',101,120,0"})
    void shouldCount(String name, int start, int end, int expected) {
        SQRService service = new SQRService();
        int actual = service.count(start, end);
        assertEquals(expected, actual);

    }
}