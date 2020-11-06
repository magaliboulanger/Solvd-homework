package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Building;

public interface IBuildingDAO {
	boolean save(Building b);
	boolean removeById(long id);
	Building getById(long id);
	List<Building> getAll();
}
