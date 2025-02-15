package tests.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Retry;
import tests.СalculatorValueDataProvider;

public class DivideTest extends BaseTest{

    @Test(dataProvider = "valueDivideDataPositive",dataProviderClass = СalculatorValueDataProvider.class,
            description = ("Positive test Divide"),
            invocationCount = 10, threadPoolSize = 4,
            priority = 5)
    public void checkDividePositiveTest(double a, double b, double expected){
        double result = calculator.divide(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "valueDivideDataNegative",dataProviderClass = СalculatorValueDataProvider.class,
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
        int result = calculator.multiply(6, 0);
        Assert.assertEquals(result, 0);
    }
}