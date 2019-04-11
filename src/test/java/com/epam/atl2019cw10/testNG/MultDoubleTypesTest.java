package com.epam.atl2019cw10.testNG;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class MultDoubleTypesTest extends BaseTestClass {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "doubleTypeValues",groups={"arithmetic"})
    public void multDoubleTest (double firstValue, double secondValue) {
        Assert.assertEquals((firstValue*secondValue),calculator.mult(firstValue,secondValue));
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}