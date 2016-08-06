package com.aiza.kata;

import javax.xml.bind.ValidationException;

public class Calculator {
	public int add(int a, int b) throws ValidationException {
		if (a < 0 || b < 0) {
			throw new ValidationException("Parameter cannot be negative");
		}
		return a + b;
	}
}
