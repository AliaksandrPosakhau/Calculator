package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class SumLongTypesTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "longTypeValues",groups={"arithmetic"})
    public void sumLongTest (long firstValue, long secondValue) {
        Assert.assertEquals(calculator.sum(firstValue,secondValue),(firstValue+secondValue));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

}
