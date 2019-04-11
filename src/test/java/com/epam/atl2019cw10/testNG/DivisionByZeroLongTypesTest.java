package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DivisionByZeroLongTypesTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(expectedExceptions=NumberFormatException.class,dataProvider = "longTypeValuesZeroDivisionDenominator",groups={"divisionByZero"})
    public void divLongTest (long firstValue, long secondValue) {
        Assert.assertEquals((firstValue / secondValue),calculator.div(firstValue, secondValue));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

}