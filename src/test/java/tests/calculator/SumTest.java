package tests.calculator;

import app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Retry;
import tests.СalculatorValueDataProvider;

public class SumTest extends BaseTest{


    @Test(dataProvider = "valueSumDataPositive",dataProviderClass = СalculatorValueDataProvider.class,
            description = ("Positive test sum"),
            invocationCount = 10, threadPoolSize = 5,
            priority = 6)
    public void checkSumPositiveTest(int a, int b, int expected){
        int result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "valueSumDataNegative",dataProviderClass = СalculatorValueDataProvider.class,
            description = ("Negative test sum"),
            retryAnalyzer = Retry.class ,
            priority = 2)
    public void checkSumNegativeTest(int a, int b, int expected){
        int result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }
}

