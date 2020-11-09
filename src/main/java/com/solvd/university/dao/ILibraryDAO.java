package com.solvd.university.dao;


import com.solvd.university.model.Library;

public interface ILibraryDAO extends DAO<Library, Long>{
	boolean save(Library b);
}
