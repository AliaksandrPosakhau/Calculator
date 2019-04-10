package com.epam.atl2019cw10;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();

        XmlSuite mainSuite = new XmlSuite();
        mainSuite.setSuiteFiles(Arrays.asList("src/test/resources/runLogicalTests"));

        List<XmlSuite>suites = new ArrayList<XmlSuite>();
        suites.add(mainSuite);

        testNG.setXmlSuites(suites);
        testNG.run();

    }
}
