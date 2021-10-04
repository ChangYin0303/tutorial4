package Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCalc {

    @Test
    public void TestAdd() {
        int a =5;
        int b = 6;
        int c = Calc.add(a,b);
        assertEquals(11,c);
    }
//    @Test
//    public void TestSubtract() {
//        int a =5;
//        int b = 6;
//        int c = Calc.subtract(a,b);
//        assertEquals(-1,c);
//    }
}