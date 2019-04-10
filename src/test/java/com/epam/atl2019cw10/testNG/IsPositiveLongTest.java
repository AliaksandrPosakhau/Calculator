package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveLongTest extends BaseTestClass {

    private Calculator calculator = new Calculator();


    @Test(dataProvider = "longTypeValue",groups={"logic"})
    public void isPositiveLongTest (long value) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.isPositive(value),(value>0)?true:false);
    }
}
