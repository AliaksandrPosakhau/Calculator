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
public class DivDBZLongTypesJUnitTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1,0},
                {-1,0},
                {0,0},
                {Long.MAX_VALUE,0},
                {Long.MIN_VALUE}
        });
    }
    private long firstValue;
    private long secondValue;


    public DivDBZLongTypesJUnitTest(long firstValue, long secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Test(expected = ArithmeticException.class)
    public void divDBZLongTypesJUnitTest() {
        Assert.assertEquals((firstValue/secondValue),calculator.div(firstValue,secondValue));
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}