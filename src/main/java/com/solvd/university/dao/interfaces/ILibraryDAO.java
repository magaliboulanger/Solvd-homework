package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Library;

public interface ILibraryDAO {
	boolean save(Library b);
	boolean removeById(long id);
	Library getById(long id);
	ArrayList<Library> getAll();
}
