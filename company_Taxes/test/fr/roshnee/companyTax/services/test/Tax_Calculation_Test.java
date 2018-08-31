package fr.roshnee.companyTax.services.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import fr.roshnee.companyTax.datamodel.Company_Details_Test;
/**
 * 
 * @author Roshnee
 * This class is to test the tax calculation
 *
 */

public class Tax_Calculation_Test {

	@Test
	public void testSelf_Employed_Tax() {

		// Given
		double CA = 30000;

		// when
		double tax = (25 * CA) / 100;

		// Then
		assertEquals(7500.00, tax, 0.0);

	}

	@Test
	public void testSAS_Tax() {

		// Given
		double CA = 30000;

		// when
		double tax = (33 * CA) / 100;

		// Then
		assertEquals(9900.00, tax, 0.0);

	}

}
