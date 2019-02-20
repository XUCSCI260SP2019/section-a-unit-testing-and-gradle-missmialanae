package edu.xavier.csci;
import org.testng.annotations.Test;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator classUnderTest = new Calculator();

        //assertNotNull("Should Provide a matching answer", classUnderTest.addition());

        int result = Test.addition(10,5);

        assertEquals(15,result);

    }
}// end Main
