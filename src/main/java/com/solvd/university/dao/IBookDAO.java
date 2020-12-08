package com.solvd.university.dao;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.solvd.university.model.Book;

public interface IBookDAO extends DAO<Book,Long>{

	@Select("insert into Book(title,author,num_pages,year,library_id) values (#{title},#{author},#{numPages},#{year},#{library_id})")
	Book save(Book b, long idLib);
	@Delete("delete from Book where id = #{id}")
	boolean removeById(Long id);
	@Select("select * from Book  where id = #{id}")
	Book getById(Long id);
	@Select("select * from Book")
	List<Book> getAll();
	@Select("select * from Cities  where library_id = #{id}")
	List<Book> getByLibId(Long id);
	
}
