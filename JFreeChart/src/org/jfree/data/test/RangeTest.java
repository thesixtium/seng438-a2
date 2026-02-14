package org.jfree.data.test;

import static org.junit.jupiter.api.Assertions.*;
import org.jfree.data.Range;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jfree.data.test.range.*;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CombineTests.class,
    RangeConstrainTest.class,
    RangeExpandTest.class,
	Range_contains_test.class,
	RangeEqualsTest.class
	})
public class RangeTest extends Range {}
