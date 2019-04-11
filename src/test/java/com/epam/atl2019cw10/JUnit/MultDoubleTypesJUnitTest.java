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
public class MultDoubleTypesJUnitTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0,0},
                {0.23245,454.456126},
                {0,0.7897564},
                {8798754.4564,0},
                {-564.687248,-546.000454},
                {0,-564.687248},
                {-564.687248,0},
                {Double.MAX_VALUE,Double.MAX_VALUE},
                {Double.MIN_VALUE,Double.MIN_VALUE},
                {Double.MIN_VALUE,Double.MAX_VALUE},
                {Double.MAX_VALUE,Double.MIN_VALUE},
                {0,Double.MIN_VALUE},
                {Double.MIN_VALUE,0},
                {0,Double.MAX_VALUE},
                {Double.MAX_VALUE,0},
                {Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY},
                {Double.POSITIVE_INFINITY,454.45454},
                {Double.POSITIVE_INFINITY,-5654.8879},
                {Double.POSITIVE_INFINITY,0},
                {5464.2345,Double.POSITIVE_INFINITY},
                {-4565.2333,Double.POSITIVE_INFINITY},
                {0,Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY,454.45454},
                {Double.NEGATIVE_INFINITY,-5654.8879},
                {Double.NEGATIVE_INFINITY,0},
                {5464.2345,Double.NEGATIVE_INFINITY},
                {-4565.2333,Double.NEGATIVE_INFINITY},
                {0,Double.NEGATIVE_INFINITY}
        });
    }
    private double firstValue;
    private double secondValue;

    public MultDoubleTypesJUnitTest(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Test
    public void multDoubleTypesJUnitTest() {
        Assert.assertEquals((firstValue*secondValue),calculator.mult(firstValue,secondValue),0D);
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}
