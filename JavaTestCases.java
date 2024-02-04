import org.junit.jupiter.api.*;

class MathUtilsTest {
    private MathUtils mathUtils;
  
    void setUp() {
        mathUtils = new MathUtils();
    }

    void testAdd() {
        assertEquals(11, mathUtils.add(7, 4));
    }

    
    void testSubtract() {
        assertEquals(7, mathUtils.subtract(15, 8));
    }

    void testMultiply() {
        assertEquals(33, mathUtils.multiply(11, 3));
    }

    void testDivide() {
        assertEquals(9.0, mathUtils.divide(81, 9));
        assertEquals(-1.0, mathUtils.divide(139, 0));
    }
}
