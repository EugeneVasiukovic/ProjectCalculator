package tests.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Retry;
import tests.СalculatorValueDataProvider;

public class MultiplyTest extends BaseTest{

    @Test(dataProvider = "valueMultiplyDataPositive",dataProviderClass = СalculatorValueDataProvider.class,
            description = ("Positive test Multiply"),
            invocationCount = 5, threadPoolSize = 5,
            priority = 5)
    public void checkMultiplyPositiveTest(int a, int b, int expected){
        int result = calculator.multiply(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "valueMultiplyDataNegative",dataProviderClass = СalculatorValueDataProvider.class,
            description = ("Negative test Multiply"),
            retryAnalyzer = Retry.class ,
            priority = 2)
    public void checkMultiplyNegativeTest(int a, int b, int expected){
        int result = calculator.multiply(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(description = "Zero test Multiply",
            retryAnalyzer = Retry.class,
            priority = 10)
    public void checkMultiplyZeroTest(){
        int result = calculator.multiply(6,0);
        Assert.assertEquals(result, 0);
    }
}