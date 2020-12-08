package com.solvd.university.dao;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.solvd.university.model.Library;

public interface ILibraryDAO extends DAO<Library, Long>{
	@Select("insert into Library(name,address_id) values (#{name},#{author},#{addr.id})")
	Library save(Library b);
	@Delete("delete from Library where id = #{id}")
	boolean removeById(Long id);
	@Select("select * from Library  where id = #{id}")
	Library getById(Long id);
	@Select("select * from Library")
	List<Library> getAll();
}
