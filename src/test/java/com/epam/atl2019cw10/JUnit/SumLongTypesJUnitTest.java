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
public class SumLongTypesJUnitTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1,1},
                {-1,-1},
                {0,0},
                {-5,5},
                {5,-5},
                {0,-5},
                {0,5},
                {6,0},
                {-5,0},
                {Long.MAX_VALUE,Long.MIN_VALUE},
                {Long.MAX_VALUE,Long.MAX_VALUE},
                {Long.MIN_VALUE,Long.MIN_VALUE},
                {Long.MIN_VALUE,Long.MAX_VALUE},
        });
    }
    private long firstValue;
    private long secondValue;

    public SumLongTypesJUnitTest(long firstValue, long secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Test
    public void sumLongTypesJUnitTest() {
        Assert.assertEquals((firstValue+secondValue),calculator.sum(firstValue,secondValue));
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}