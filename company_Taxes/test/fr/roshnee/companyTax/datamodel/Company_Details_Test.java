package fr.roshnee.companyTax.datamodel;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/**
 * 
 * @author Roshnee
 * This class is to test the setters and getters
 *
 */
public class Company_Details_Test {

	@Test
	public void testSetAndGetSiret() {
		// Given
		String siret = "A1678";

		// When
		Company_Details details = new Company_Details();
		details.setSiret(siret);

		// Then

		Assert.assertTrue(details.getSiret().equals(siret));

	}

	@Test
	public void testSetAndGetDenomination() {
		// Given
		String denomination = "Nanny_Bag";

		// When
		Company_Details details = new Company_Details();
		details.setDenomination(denomination);
		

		// Then

		Assert.assertTrue(details.getDenomination().equals(denomination));
	}

	@Test
	public void testSetAndGetRegistered_Address() {
		// Given
		String Address = "rue Jean Jacques Rousseau";

		// When
		Company_Details details = new Company_Details();
		details.setRegistered_Address(Address);
		

		// Then

		Assert.assertTrue(details.getRegistered_Address().equals(Address));
	}

}
