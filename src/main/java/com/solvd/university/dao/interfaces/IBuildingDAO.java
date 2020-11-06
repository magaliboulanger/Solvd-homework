package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Building;

public interface IBuildingDAO {
	public boolean save(Building b);
	public boolean removeById(long id);
	public Building getById(long id);
	public ArrayList<Building> getAll();
}
