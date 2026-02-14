package org.jfree.data.test;

import org.jfree.data.DataUtilities;
import org.jfree.data.test.datautilities.*;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	GetCumulativePercentagesTests.class,
	DataUtCreateNumArr2D.class,
	DataUtilitiesCalculateColumnTotalTest.class,
	DataUtilitiesRowTotalTest.class,
	DataUtilitiesNumberArray.class
	})
public class DataUtilitiesTest extends DataUtilities {}
