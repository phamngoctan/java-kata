package com.aiza.kata;

import javax.xml.bind.ValidationException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	// when I input two int numbers then I expect getting summary of those numbers
	@Test
	public void add_getCorrectSum() throws ValidationException {
		Calculator calculator = new Calculator();
		int sumResult = calculator.add(1, 2);
		Assert.assertTrue(sumResult == 3);
	}
	
	// when I input first parameter the negative number then I expect getting a exception
	@Test
	public void add_negativeNumberFirstInput() throws ValidationException {
		Calculator calculator = new Calculator();
		expectedException.expect(ValidationException.class);
		calculator.add(-10, 5);
	}
	
	// when I input second parameter the negative number then I also expect getting a exception
	@Test
	public void add_negativeNumberSecondInput() throws ValidationException {
		Calculator calculator = new Calculator();
		expectedException.expect(ValidationException.class);
		calculator.add(5, -1);
	}
	
}
