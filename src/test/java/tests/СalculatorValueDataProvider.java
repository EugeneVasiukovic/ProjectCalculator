package tests;

import org.testng.annotations.DataProvider;

public class СalculatorValueDataProvider {

    @DataProvider(name = "valueSumDataPositive")
    public Object[][] valueSumDataPositive() {
        return new Object[][]{
                {2, 3, 5},
                {1, 7, 8},
                {0, 5, 5},
                {5, 2, 7},
                {6, 0, 6},
                {-2, -9, -11}
        };
    }

    @DataProvider(name = "valueSumDataNegative")
    public Object[][] valueSumDataNegative() {
        return new Object[][]{
                {2, 3, 57},
                {1, 7, 4},
                {0, 5, 0},
                {5, 2, 12},
                {6, 0, -5},
                {-2, -9, 11}
        };
    }

    @DataProvider(name = "valueSubtractDataPositive")
    public Object[][] valueSubtractDataPositive() {
        return new Object[][]{
                {2, 3, -1},
                {5, 7, -2},
                {5, 2, 3},
                {12, 12, 0},
                {6, -8, 14},
                {-2, -9, 7}
        };
    }

    @DataProvider(name = "valueSubtractDataNegative")
    public Object[][] valueSubtractDataNegative() {
        return new Object[][]{
                {2, 3, 5},
                {5, 7, 30},
                {5, 5, 25},
                {12, 12, 8},
                {6, -8, -5},
                {-2, -9, -7}
        };
    }

    @DataProvider(name = "valueMultiplyDataPositive")
    public Object[][] valueMultiplyDataPositive() {
        return new Object[][]{
                {2, 3, 6},
                {5, 7, 35},
                {5, 5, 25},
                {12, 12, 144},
                {6, 6, 36},
                {-2, -9, 18}
        };
    }

    @DataProvider(name = "valueMultiplyDataNegative")
    public Object[][] valueMultiplyDataNegative() {
        return new Object[][]{
                {2, 3, 7},
                {5, 7, 31},
                {5, 5, 15},
                {12, 12, 143},
                {6, 6, 35},
                {-2, -9, -18}
        };
    }



    @DataProvider(name = "valueDivideDataPositive")
    public Object[][] valueDivideDataPositive() {
        return new Object[][]{
                {12, 3, 4},
                {15, 5, 3},
                {5, 5, 1},
                {12, 12, 1},
                {144, 12, 12},
                {-2, -9, 0.2222222222222222}
        };
    }

    @DataProvider(name = "valueDivideDataNegative")
    public Object[][] valueDivideDataNegative() {
        return new Object[][]{
                {2, 3, 7},
                {5, 7, 31},
                {5, 5, 15},
                {12, 12, 143},
                {6, 6, 35},
                {-2, -9, -18}
        };
    }
}
