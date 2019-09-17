package be.ae.testing.lab_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import be.ae.testing.lab_1.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("Example test: can add 1 and 2")
	void exampleTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(3, result, "1 + 2 should equal 3");
	}

}
