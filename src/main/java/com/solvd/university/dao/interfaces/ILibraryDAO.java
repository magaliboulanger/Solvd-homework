package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Library;

public interface ILibraryDAO {
	public boolean save(Library b);
	public boolean removeById(long id);
	public Library getById(long id);
	public ArrayList<Library> getAll();
}
