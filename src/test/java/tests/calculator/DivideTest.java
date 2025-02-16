package tests.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Retry;
import tests.CalculatorValueDataProvider;

public class DivideTest extends BaseTest {

    @Test(dataProvider = "valueDivideDataPositive",
            dataProviderClass = CalculatorValueDataProvider.class,
            description = ("Positive test Divide"),
            invocationCount = 5, threadPoolSize = 1,
            priority = 5)
    public void checkDividePositiveTest(double a, double b, double expected){
        double result = calculator.divide(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "valueDivideDataNegative",
            dataProviderClass = CalculatorValueDataProvider.class,
            description = ("Negative test Divide"),
            retryAnalyzer = Retry.class ,
            priority = 2)
    public void checkDivideNegativeTest(double a, double b, double expected){
        double result = calculator.divide(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(description = "Zero test Divide",
            retryAnalyzer = Retry.class,
            priority = 10)
    public void checkDivideZeroTest(){
        double result = calculator.divide(6, 0);
        Assert.assertEquals(result, 0);
    }
}