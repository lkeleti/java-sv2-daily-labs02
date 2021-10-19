package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void calculateAreaTest() {
        Rectangle rectangle = new Rectangle(2.0, 5.0);
        double result = rectangle.calculateArea();

        assertEquals(10.0, result, 0.000001);
    }
}
