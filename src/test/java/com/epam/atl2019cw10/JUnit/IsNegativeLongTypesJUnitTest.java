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
public class IsNegativeLongTypesJUnitTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1},
                {-1},
                {-19224},
                {150265},
                {0},
                {0L},
                {Long.MAX_VALUE},
                {Long.MIN_VALUE},
        });
    }
    private long firstValue;

    public IsNegativeLongTypesJUnitTest(long firstValue) {
        this.firstValue = firstValue;
    }

    @Test
    public void isNegativeLongTypesJUnitTest() {
        Assert.assertEquals(((firstValue<0)?true:false),calculator.isNegative(firstValue));
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}