package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DivisionByZeroDoubleTypesTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "doubleTypeValuesWithZeroDenominator",expectedExceptions=IllegalArgumentException.class,groups={"divisionByZero"})
    public void divisionByZeroDoubleTypesTest (double firstValue, double secondValue) {
        Assert.assertEquals(calculator.div(firstValue, secondValue), (firstValue / secondValue));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}