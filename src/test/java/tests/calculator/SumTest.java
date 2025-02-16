package tests.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Retry;
import tests.CalculatorValueDataProvider;

public class SumTest extends BaseTest {

    @Test(dataProvider = "valueSumDataPositive",
            dataProviderClass = CalculatorValueDataProvider.class,
            description = ("Positive test sum"),
            invocationCount = 10, threadPoolSize = 2,
            priority = 6)
    public void checkSumPositiveTest(int a, int b, int expected){
        int result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "valueSumDataNegative",
            dataProviderClass = CalculatorValueDataProvider.class,
            description = ("Negative test sum"),
            retryAnalyzer = Retry.class ,
            priority = 2)
    public void checkSumNegativeTest(int a, int b, int expected){
        int result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }
}

