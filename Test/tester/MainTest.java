package tester;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Valid operator: '+', Valid numbers: 0 to 100
    @Test
    public void test1() {
        char operator = '+';
        double number1 = 50.0;
        double number2 = 30.0;
        String expected = "50.0 + 30.0 = 80.0";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }


    // Valid operator: '+', Invalid number1 (less than 0)
    @Test
    public void test2() {
        char operator = '+';
        double number1 = -10.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '+', Invalid number1 (greater than 100)
    @Test
    public void test3() {
        char operator = '+';
        double number1 = 120.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '+', Invalid number2 (less than 0)
    @Test
    public void test4() {
        char operator = '+';
        double number1 = 50.0;
        double number2 = -30.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '+', Invalid number2 (greater than 100)
    @Test
    public void test5() {
        char operator = '+';
        double number1 = 50.0;
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '-', Valid numbers: 0 to 100
    @Test
    public void test6() {
        char operator = '-';
        double number1 = 80.0;
        double number2 = 20.0;
        String expected = "80.0 - 20.0 = 60.0";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }


    // Valid operator: '-', Invalid number1 (less than 0)
    @Test
    public void test7() {
        char operator = '-';
        double number1 = -10.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '-', Invalid number1 (greater than 100)
    @Test
    public void test8() {
        char operator = '-';
        double number1 = 120.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '-', Invalid number2 (less than 0)
    @Test
    public void test9() {
        char operator = '-';
        double number1 = 50.0;
        double number2 = -30.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '-', Invalid number2 (greater than 100)
    @Test
    public void test10() {
        char operator = '-';
        double number1 = 50.0;
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '*', Valid numbers: 0 to 100
    @Test
    public void test11() {
        char operator = '*';
        double number1 = 10.0;
        double number2 = 5.0;
        String expected = "10.0 * 5.0 = 50.0";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }


    // Valid operator: '*', Invalid number1 (less than 0)
    @Test
    public void test12() {
        char operator = '*';
        double number1 = -10.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '*', Invalid number1 (greater than 100)
    @Test
    public void test13() {
        char operator = '*';
        double number1 = 120.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '*', Invalid number2 (less than 0)
    @Test
    public void test14() {
        char operator = '*';
        double number1 = 50.0;
        double number2 = -30.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '*', Invalid number2 (greater than 100)
    @Test
    public void test15() {
        char operator = '*';
        double number1 = 50.0;
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '/', Valid numbers: 0 to 100
    @Test
    public void test16() {
        char operator = '/';
        double number1 = 100.0;
        double number2 = 10.0;
        String expected = "100.0 / 10.0 = 10.0";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }


    // Valid operator: '/', Invalid number1 (less than 0)
    @Test
    public void test17() {
        char operator = '/';
        double number1 = -10.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '/', Invalid number1 (greater than 100)
    @Test
    public void test18() {
        char operator = '/';
        double number1 = 120.0; // Invalid number
        double number2 = 50.0;
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '/', Invalid number2 (less than 0)
    @Test
    public void test19() {
        char operator = '/';
        double number1 = 50.0;
        double number2 = -30.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Valid operator: '/', Invalid number2 (greater than 100)
    @Test
    public void test20() {
        char operator = '/';
        double number1 = 50.0;
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }


    // Invalid operator, valid numbers: 0 to 100
    @Test
    public void test21() {
        char operator = '%'; // Invalid operator
        double number1 = 50.0;
        double number2 = 30.0;
        String expected = "Invalid operator!";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Invalid operator, invalid number1 (less than 0)
    @Test
    public void test22() {
        char operator = '%'; // Invalid operator
        double number1 = -10.0; // Invalid number
        double number2 = 50.0;
        String expected = "Invalid operator!";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Invalid operator, invalid number1 (greater than 100)
    @Test
    public void test23() {
        char operator = '%'; // Invalid operator
        double number1 = 150.0;// Invalid number
        double number2 = 50.0;
        String expected = "Invalid operator!";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Invalid operator, invalid number2 (less than 0)
    @Test
    public void test24() {
        char operator = '%'; // Invalid operator
        double number1 = 50.0;
        double number2 = -10.0; // Invalid number
        String expected = "Invalid operator!";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Invalid operator, invalid number2 (greater than 100)
    @Test
    public void test25() {
        char operator = '%'; // Invalid operator
        double number1 = 50.0;
        double number2 = 150.0;// Invalid number
        String expected = "Invalid operator!";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }


    // Both numbers invalid, valid operator
    @Test
    public void test26() {
        char operator = '+';
        double number1 = -10.0; // Invalid number
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Both numbers invalid, valid operator
    @Test
    public void test27() {
        char operator = '-';
        double number1 = -10.0; // Invalid number
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Both numbers invalid, valid operator
    @Test
    public void test28() {
        char operator = '*';
        double number1 = -10.0; // Invalid number
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Both numbers invalid, valid operator
    @Test
    public void test29() {
        char operator = '/';
        double number1 = -10.0; // Invalid number
        double number2 = 150.0; // Invalid number
        String expected = "The number is out of range";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }

    // Both numbers invalid, valid operator
    @Test
    public void test30() {
        char operator = '%';
        double number1 = -10.0; // Invalid number
        double number2 = 150.0; // Invalid number
        String expected = "Invalid operator!";
        String result = Main.calculate(operator, number1, number2);
        assertEquals(expected, result);
    }






}