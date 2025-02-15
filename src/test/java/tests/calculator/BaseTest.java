package tests.calculator;

import tests.TestListener;
import app.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {
    Calculator calculator;

    @BeforeMethod
    public void initTest(){
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown(){
        calculator = null;
    }
}