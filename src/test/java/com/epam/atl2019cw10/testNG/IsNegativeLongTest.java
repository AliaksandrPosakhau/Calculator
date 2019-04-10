package com.epam.atl2019cw10.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeLongTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "longTypeValue",groups={"logic"})
    public void isNegativeLongTest (long value) {
        Assert.assertEquals(calculator.isNegative(value),((value<0)?true:false));
    }
}