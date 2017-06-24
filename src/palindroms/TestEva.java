package palindroms;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEva {

	@Test
	public void testEvaEvenPositive() {
		assertEquals(true, Evaluation.isPalindrom("anna"));
	}

	@Test
	public void testEvaEvenNegative() {
		assertEquals(false, Evaluation.isPalindrom("maria"));
	}
	
	@Test
	public void testEvaOddPositive() {
		assertEquals(true, Evaluation.isPalindrom("kajak"));
	}
	
	@Test
	public void testEvaOddNegative() {
		assertEquals(false, Evaluation.isPalindrom("Grzesio"));
	}
}
