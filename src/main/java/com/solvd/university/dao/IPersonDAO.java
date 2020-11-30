package com.solvd.university.dao;

import com.solvd.university.model.*;

public interface IPersonDAO extends DAO<Person, Long> {

	long save(Person b);
	long getAddressId(Long idPerson);
}
