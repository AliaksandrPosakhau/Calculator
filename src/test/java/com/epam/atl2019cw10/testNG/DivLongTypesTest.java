package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DivLongTypesTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "longTypeValuesWithoutZeroDenominator",groups={"arithmetic"})
    public void divLongTest (long firstValue, long secondValue) {
        Assert.assertEquals(calculator.div(firstValue,secondValue),(firstValue/secondValue));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

}