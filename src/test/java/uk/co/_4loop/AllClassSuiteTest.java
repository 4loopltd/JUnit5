package uk.co._4loop;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({AssertionTest.class, AssumptionTest.class})
public class AllClassSuiteTest {}
