package tests.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Retry;
import tests.СalculatorValueDataProvider;

public class SubtractTest extends BaseTest{

    @Test(dataProvider = "valueSubtractDataPositive",dataProviderClass = СalculatorValueDataProvider.class,
            description = ("Positive test Subtract"),
            invocationCount = 10, threadPoolSize = 1 ,
            priority = 5)
    public void checkSubtractPositiveTest(int a, int b, int expected){
        int result = calculator.subtract(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "valueSumDataNegative",dataProviderClass = СalculatorValueDataProvider.class,
            description = ("Negative test Subtract"),
            retryAnalyzer = Retry.class ,
            priority = 2)
    public void checkSubtractNegativeTest(int a, int b, int expected){
        int result = calculator.subtract(a, b);
        Assert.assertEquals(result, expected);
    }
}