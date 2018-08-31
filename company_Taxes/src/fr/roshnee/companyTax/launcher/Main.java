package fr.roshnee.companyTax.launcher;

import java.util.Scanner;

import fr.roshnee.companyTax.datamodel.Company_Details;
import fr.roshnee.companyTax.services.Tax_Calculation;

public class Main {

	public static void main(String[] args) {

		Company_Details details = new Company_Details();
		while (true) {
			System.out.println("Welcome to the tax calculator");

			Scanner choose = new Scanner(System.in);
			System.out.println("Please select the Type of company \n");
			System.out.println("1. Self_Employed");
			System.out.println("2. SAS");
			System.out.println("3. Exit");

			int choice = choose.nextInt();

			switch (choice) {

			case 1:
				Tax_Calculation tax = new Tax_Calculation();
				tax.self_Employed_Tax(details);
				break;

			case 2:
				Tax_Calculation tax1 = new Tax_Calculation();
				tax1.SAS_Tax(details);
				break;

			case 3:
				System.out.println("Exiting Program...");
				System.exit(0);
				break;

			}
		}

	}
}
