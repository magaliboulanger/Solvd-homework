package com.solvd.university.dao;


import com.solvd.university.model.Library;

public interface ILibraryDAO extends DAO<Library, Long>{
	long save(Library b);
}
