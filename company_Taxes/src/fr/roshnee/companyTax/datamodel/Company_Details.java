package fr.roshnee.companyTax.datamodel;
/**
 * 
 * @author Roshnee
 *
 */

public class Company_Details {

	public String siret;
	public String denomination;
	public String registered_Address;

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getRegistered_Address() {
		return registered_Address;
	}

	public void setRegistered_Address(String registered_Address) {
		this.registered_Address = registered_Address;
	}

}
