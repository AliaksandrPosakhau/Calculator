package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DoubleSqrtTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "doubleTypeValue",groups={"arithmetic"})
    public void doubleSqrtTest (double value) {
        Assert.assertEquals((Math.sqrt(value)),calculator.sqrt(value));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}