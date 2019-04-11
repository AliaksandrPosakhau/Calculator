package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DoubleSinTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "doubleTypeValue",groups={"trigonometric"})
    public void doubleSinTest (double value) {
        Assert.assertEquals(Math.sin(value),calculator.sin(value));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}
