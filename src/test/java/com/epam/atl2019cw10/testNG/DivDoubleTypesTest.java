package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DivDoubleTypesTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "doubleTypeValuesWithoutZeroDenominator",groups={"arithmetic"})
    public void divDoubleTypesTest (double firstValue, double secondValue) {
        Assert.assertEquals((firstValue / secondValue),calculator.div(firstValue, secondValue));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}
