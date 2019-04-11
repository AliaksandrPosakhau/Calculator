package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DoubleTgTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "doubleTypeValue",groups={"trigonometric"})
    public void doubleTgTest (double value) {
        Assert.assertEquals(Math.tan(value),calculator.tg(value));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

}