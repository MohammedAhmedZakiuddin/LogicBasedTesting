import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryOpTest {

    private BinaryOp binaryOp;

    @Test
    void isArithmeticTest1() // TR1 Test ID 1
    {
        binaryOp = new BinaryOp("+");
        assertTrue(binaryOp.isArithmetic());
    }

    @Test
    void isArithmeticTest2() // TR2  Test ID 2
    {
        binaryOp = new BinaryOp("#");
        assertFalse(binaryOp.isArithmetic());
    }


    @Test
    void isArithmeticTest3() // TR3  Test ID 3
    {
        binaryOp = new BinaryOp("-");
        assertTrue(binaryOp.isArithmetic());
    }

    @Test
    void isArithmeticTest4() // TR4  Test ID 4
    {
        binaryOp = new BinaryOp("@");
        assertFalse(binaryOp.isArithmetic());

    }

    @Test
    void isArithmeticTest5() // TR5  Test ID 5
    {
        binaryOp = new BinaryOp("*");
        assertTrue(binaryOp.isArithmetic());
    }

    @Test
    void isArithmeticTest6() // TR6  Test ID 6
    {
        binaryOp = new BinaryOp("!");
        assertFalse(binaryOp.isArithmetic());
    }


    @Test
    void isArithmeticTest7() // TR7  Test ID 7
    {
        binaryOp = new BinaryOp("/");
        assertTrue(binaryOp.isArithmetic());
    }

    @Test
    void isArithmeticTest8() // TR8  Test ID 8
    {
        binaryOp = new BinaryOp("$");
        assertFalse(binaryOp.isArithmetic());

    }
    @Test
    void isLogicalTest1() // TR1 Test ID 39
    {
        binaryOp = new BinaryOp("||");
        assertEquals(true,binaryOp.isLogical());
    }
    @Test
    void isLogicalTest2() // TR1 Test ID 40
    {
        binaryOp = new BinaryOp("!");
        assertEquals(false,binaryOp.isLogical());
    }
    @Test
    void isLogicalTest3() // TR1 Test ID 41
    {
        binaryOp = new BinaryOp("&&");
        assertEquals(true,binaryOp.isLogical());
    }
    @Test
    void isLogicalTest4() // TR1 Test ID 41
    {
        binaryOp = new BinaryOp("~");
        assertEquals(false,binaryOp.isLogical());
    }
}