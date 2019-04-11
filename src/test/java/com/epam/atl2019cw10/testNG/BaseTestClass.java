package com.epam.atl2019cw10.testNG;
import org.testng.annotations.DataProvider;

public class BaseTestClass {

    @DataProvider(name="longTypeValues")
    public Object[][] valuesLong() {
        return new Object[][]{
                {1,1},
                {-1,-1},
                {0,0},
                {-5,5},
                {5,-5},
                {5,-5},
                {0,-5},
                {0,5},
                {6,0},
                {-5,0},
                {0,-5},
                {Long.MAX_VALUE,Long.MIN_VALUE},
                {Long.MAX_VALUE,Long.MAX_VALUE},
                {Long.MIN_VALUE,Long.MIN_VALUE},
                {Long.MIN_VALUE,Long.MAX_VALUE},
        };
    }

    @DataProvider(name="longTypeValue")
    public Object[][] valueLong() {
        return new Object[][]{
                {1},
                {-1},
                {-19224},
                {150265},
                {0},
                {0L},
                {Long.MAX_VALUE},
                {Long.MIN_VALUE},
        };
    }

    @DataProvider(name="longTypeValuesWithoutZeroDenominator")
    public Object[][] longTypeValuesWithoutZeroDenominator() {
        return new Object[][]{
                {1,1},
                {-1,-1},
                {-5,5},
                {5,-5},
                {5,-5},
                {0,-5},
                {0,5},
                {0,-5},
                {Long.MAX_VALUE,Long.MIN_VALUE},
                {Long.MAX_VALUE,Long.MAX_VALUE},
                {Long.MIN_VALUE,Long.MIN_VALUE},
                {Long.MIN_VALUE,Long.MAX_VALUE},
        };
    }

    @DataProvider(name="longTypeValuesZeroDivisionDenominator")
    public Object[][] longTypeValuesZeroDivisionDenominator() {
        return new Object[][]{
                {1,0},
                {-1,0},
                {0,0},
        };
    }

    @DataProvider(name="doubleTypeValues")
    public Object[][] valuesDouble() {
        return new Object[][]{
                {0,0},
                {0.23245,454.456126},
                {0,0.7897564},
                {8798754.4564,0},
                {-564.687248,-546.000454},
                {0,-564.687248},
                {-564.687248,0},
                {Double.MAX_VALUE,Double.MAX_VALUE},
                {Double.MIN_VALUE,Double.MIN_VALUE},
                {Double.MIN_VALUE,Double.MAX_VALUE},
                {Double.MAX_VALUE,Double.MIN_VALUE},
                {0,Double.MIN_VALUE},
                {Double.MIN_VALUE,0},
                {0,Double.MAX_VALUE},
                {Double.MAX_VALUE,0},
                {Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY},
                {Double.POSITIVE_INFINITY,454.45454},
                {Double.POSITIVE_INFINITY,-5654.8879},
                {Double.POSITIVE_INFINITY,0},
                {5464.2345,Double.POSITIVE_INFINITY},
                {-4565.2333,Double.POSITIVE_INFINITY},
                {0,Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,454.45454},
                {Double.NEGATIVE_INFINITY,-5654.8879},
                {Double.NEGATIVE_INFINITY,0},
                {5464.2345,Double.NEGATIVE_INFINITY},
                {-4565.2333,Double.NEGATIVE_INFINITY},
                {0,Double.NEGATIVE_INFINITY}
        };
    }

    @DataProvider(name="doubleTypeValue")
    public Object[][] doubleTypeValue() {
        return new Object[][]{
                {0},
                {0.23245},
                {-564.687248},
                {Double.MAX_VALUE},
                {Double.MIN_VALUE},
                {Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY}
        };
    }

    @DataProvider(name="doubleTypeValuesWithoutZeroDenominator")
    public Object[][] valuesDoubleWithoutZeroDenominator() {
        return new Object[][]{
                {0.23245,454.456126},
                {-564.687248,-546.000454},
                {989.684548,-546.000454},
                {-62.02,556.66565666},
                {Double.MAX_VALUE,Double.MAX_VALUE},
                {Double.MIN_VALUE,Double.MIN_VALUE},
                {Double.MIN_VALUE,Double.MAX_VALUE},
                {Double.MAX_VALUE,Double.MIN_VALUE},
                {Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY},
                {Double.POSITIVE_INFINITY,454.45454},
                {Double.POSITIVE_INFINITY,-5654.8879},
                {5464.2345,Double.POSITIVE_INFINITY},
                {-4565.2333,Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,454.45454},
                {Double.NEGATIVE_INFINITY,-5654.8879},
                {5464.2345,Double.NEGATIVE_INFINITY},
                {-4565.2333,Double.NEGATIVE_INFINITY},
                {0,Double.NEGATIVE_INFINITY}
        };
    }

    @DataProvider(name="doubleTypeValuesWithZeroDenominator")
    public Object[][] valuesDoubleWithZeroDenominator() {
        return new Object[][]{
                {0,0},
                {8798754.4564,0},
                {-564.687248,0},
                {Double.POSITIVE_INFINITY,0},
                {Double.NEGATIVE_INFINITY,0},
                {Double.MAX_VALUE,0},
                {Double.MIN_VALUE,0}
        };
    }

}
