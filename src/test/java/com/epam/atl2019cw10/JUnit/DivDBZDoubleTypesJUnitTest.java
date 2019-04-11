package com.epam.atl2019cw10.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivDBZDoubleTypesJUnitTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0,0},
                {8798754.4564,0},
                {-564.687248,0},
                {Double.POSITIVE_INFINITY,0},
                {Double.NEGATIVE_INFINITY,0},
                {Double.MAX_VALUE,0},
                {Double.MIN_VALUE,0}
        });
    }
    private double firstValue;
    private double secondValue;

    public DivDBZDoubleTypesJUnitTest(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Test(expected = ArithmeticException.class)
    public void divDoubleTypesJUnitTest() {
        Assert.assertEquals((firstValue/secondValue),calculator.div(firstValue,secondValue),0D);
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}
