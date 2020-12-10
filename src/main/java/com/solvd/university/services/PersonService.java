package com.solvd.university.services;

import com.solvd.university.dao.*;
import com.solvd.university.dao.mysql.*;
import com.solvd.university.model.*;

public class PersonService {

	private IPersonDAO pdao;
	private IAddressDAO adao;
	
	public PersonService() {
		pdao = new PersonDAO();
	}
	
	public Person getById(Long id) {
		Person person = pdao.getById(id).get();
		Address address = adao.getById(pdao.getAddressId(id)).get();
		person.setAddress(address);
		return person;
	}
}
