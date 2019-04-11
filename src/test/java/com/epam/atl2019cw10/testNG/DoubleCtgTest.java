package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DoubleCtgTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "doubleTypeValue",groups={"trigonometric"})
    public void doubleTgTest (double value) {
        Assert.assertEquals(1/Math.tan(value),calculator.ctg(value));
        //Assert.assertEquals(1/Math.tan(value),(Math.cos(value)/Math.sin(value))); - NOT EQUAL ANYWAY! CALCULATION ERROR!
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}