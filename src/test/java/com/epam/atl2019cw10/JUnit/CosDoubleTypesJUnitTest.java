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
public class CosDoubleTypesJUnitTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0},
                {0.23245},
                {-564.687248},
                {9},
                {Double.MAX_VALUE},
                {Double.MIN_VALUE},
                {Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY}
        });
    }
    private double firstValue;

    public CosDoubleTypesJUnitTest(double firstValue) {
        this.firstValue = firstValue;
    }

    @Test
    public void cosDoubleTypesJUnitTest() {
        Assert.assertEquals((Math.cos(firstValue)),calculator.cos(firstValue),0D);
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}