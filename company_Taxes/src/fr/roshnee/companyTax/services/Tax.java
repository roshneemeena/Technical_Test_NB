package fr.roshnee.companyTax.services;

import fr.roshnee.companyTax.datamodel.Company_Details;

public interface Tax {

	public void self_Employed_Tax(Company_Details details);
	public void SAS_Tax(Company_Details details);
}
