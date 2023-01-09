import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExprTest {

    private Expr expr;

    @Test
    void testToStringTR1()
    {
        expr = new Expr("foo",'s');
        String s = expr.toString();

        assertEquals("foo",s);
    }

    @Test
    void testToStringTR2()
    {
        expr = new Expr(1);
        String s = expr.toString();

        assertEquals("1",s);
    }

    @Test
    void testToStringTR3()
    {
        expr = new Expr("foo",'z');
        String s = expr.toString();

        assertEquals("foo",s);
    }

    @Test
    void testToStringTR4()
    {
        float x = 1;
        expr = new Expr(x);
        String s = expr.toString();

        assertEquals("1.0",s);
    }
    @Test
    void testToStringTR5()
    {
        int x = 100;
        expr = new Expr(x);
        String s = expr.toString();

        assertEquals("100",s);
    }

    @Test
    void testToStringTR6()
    {
        float x = 100;
        expr = new Expr(x);
        String s = expr.toString();

        assertEquals("100.0",s);
    }

    @Test
    void testToStringTR7()
    {
        float x = 2;
        expr = new Expr(x);
        String s = expr.toString();

        assertEquals("2.0",s);
    }

    @Test
    void testToStringTR8()
    {
        String n = "foo";
        Name nono = new Name(n);
        expr = new Expr(nono);
        String s = expr.toString();

        assertEquals("foo",s);
    }
    @Test
    void testToStringTR9()
    {
        String n = "return 0;";
        Name nono = new Name(n);
        expr = new Expr(nono);
        String s = expr.toString();

        assertEquals("return 0;",s);
    }
    @Test
    void testToStringTR10()
    {
        expr = new Expr("string",'s');
        String s = expr.toString();

        assertEquals("string",s);
    }

    @Test
    void testToStringTR11()
    {
        expr = new Expr(true);
        String s = expr.toString();

        assertEquals("true",s);
    }

    @Test
    void testToStringTR12()
    {
        Expr expr1 = new Expr(1);
        expr = new Expr(expr1);
        String s = expr.toString();

        assertEquals("1",s);
    }

    @Test
    void testToStringTR13()
    {
        expr = new Expr(true);
        String s = expr.toString();

        assertEquals("true",s);
    }

    @Test
    void testToStringTR14()
    {
        expr = new Expr(false);
        String s = expr.toString();

        assertEquals("false",s);
    }
    @Test
    void testToStringTR15()
    {
        Expr expr1 = new Expr(111);
        expr = new Expr(expr1);
        String s = expr.toString();

        assertEquals("111",s);
    }
    @Test
    void testToStringTR16()
    {
        Expr expr1 = new Expr("foo",'s');
        expr = new Expr(expr1,"boo");
        String s = expr.toString();

        assertEquals("(boo foo)",s);
    }
    @Test
    void testToStringTR17()
    {
        Expr expr1 = new Expr("int x",'s');
        expr = new Expr(expr1,"string s");
        String s = expr.toString();

        assertEquals("(string s int x)",s);
    }
    @Test
    void testToStringTR18()
    {
        Expr expr1 = new Expr("x",'s');
        expr = new Expr("int",expr1);
        String s = expr.toString();

        assertEquals("(int)x",s);
    }

    @Test
    void testToStringTR19()
    {
        Expr expr1 = new Expr("y",'s');
        expr = new Expr("int",expr1);
        String s = expr.toString();

        assertEquals("(int)y",s);
    }

    @Test
    void testToStringTR20()
    {
        BinaryOp binaryOp = new BinaryOp("+");
        Expr expr1 = new Expr("y",'s');
        expr = new Expr(expr1,binaryOp,expr1);
        String s = expr.toString();

        assertEquals("(y + y)",s);
    }
    @Test
    void testToStringTR21()
    {
        BinaryOp binaryOp = new BinaryOp("+");
        Expr expr1 = new Expr("1",'s');
        expr = new Expr(expr1,binaryOp,expr1);
        String s = expr.toString();

        assertEquals("(1 + 1)",s);
    }
    @Test
    void testToStringTR22()
    {
        Expr expr1 = new Expr("1",'s');
        expr = new Expr(expr1,expr1,expr1);
        String s = expr.toString();

        assertEquals("( 1 ? 1 : 1 )",s);
    }
    @Test
    void testToStringTR23()
    {
        Expr expr1 = new Expr("len",'s');
        expr = new Expr(expr1,expr1,expr1);
        String s = expr.toString();

        assertEquals("( len ? len : len )",s);
    }
    @Test
    void testToStringTR24()
    {
        Expr expr1 = new Expr("len",'s');
        Expr expr2 = new Expr("x",'s');
        ArrayList<Expr> exprs = new ArrayList<>();
        exprs.add(expr2);
        exprs.add(expr1);
        expr = new Expr("foo",exprs);
        String s = expr.toString();

        assertEquals("foo(x, len)",s);
    }
    @Test
    void testToStringTR25()
    {
        Expr expr1 = new Expr("1",'s');
        Expr expr2 = new Expr("5",'s');
        ArrayList<Expr> exprs = new ArrayList<>();
        exprs.add(expr2);
        exprs.add(expr1);
        expr = new Expr("sum",exprs);
        String s = expr.toString();

        assertEquals("sum(5, 1)",s);
    }
    @Test
    void testToStringTR26()
    {
        Expr expr1 = new Expr("1",'s');
        Expr expr2 = new Expr("5",'s');
        expr = new Expr("sum",true);
        String s = expr.toString();

        assertEquals("sum()",s);
    }

    @Test
    void testToStringTR27()
    {

        ArrayList<Expr> exprs = new ArrayList<>();
        Expr expr1 = new Expr("x",'s');
        Expr expr2 = new Expr("y",'s');
        exprs.add(expr2);
        exprs.add(expr1);
        expr = new Expr("",exprs);
        String s = expr.toString();

        assertEquals("(y, x)",s);
    }

    @Test
    void testToStringTR28()
    {

        ArrayList<Expr> exprs = new ArrayList<>();
        expr = new Expr("",exprs);
        String s = expr.toString();
        assertEquals("()",s);
    }

    @Test
    void testToStringTR29()
    {

        expr = new Expr("sum",false);
        String s = expr.toString();

        assertEquals("sum()",s);
    }
    @Test
    void testToStringTR30()
    {

        expr = new Expr("sum",false);
        expr.typeNumber = 100;
        String s = expr.toString();

        assertEquals("",s);
    }

}