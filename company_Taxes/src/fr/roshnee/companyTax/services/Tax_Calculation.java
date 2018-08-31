package fr.roshnee.companyTax.services;

import java.util.Scanner;

import fr.roshnee.companyTax.datamodel.Company_Details;
/**
 * 
 * @author Roshnee
 * This method is to calculate the tax for the self employed companies
 *
 */

public class Tax_Calculation implements Tax {

	@Override
	public void self_Employed_Tax(Company_Details details) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Number SIRET of the company : \n");
		String Siret = input.nextLine();
		details.setSiret(Siret);
		System.out.println("Please enter the Denomination: \n ");
		String name = input.nextLine();
		details.setDenomination(name);
		System.out.println("Please Enter the CA of the company: \n");
		double CA = input.nextDouble();
		double tax = (25 * CA) / 100;
		System.out.println("The tax is :" + tax + "Euros");

	}

	@Override
	/**
	 * This Methos is to calculate the tax for the SAS companies
	 */
	public void SAS_Tax(Company_Details details) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Number SIRET of the company : \n");
		String Siret = input.nextLine();
		details.setSiret(Siret);
		System.out.println("Please enter the Denomination: \n ");
		String name = input.nextLine();
		details.setDenomination(name);
		System.out.println("Please enter the Registerd address \n");
		String address = input.nextLine();
		details.setRegistered_Address(address);
		System.out.println("Please Enter the CA of the company: \n");
		double CA = input.nextDouble();
		double tax = (33 * CA) / 100;
		System.out.println("The tax is :" + tax + "Euros");

	}

}
