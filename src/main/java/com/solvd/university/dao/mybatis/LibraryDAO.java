package com.solvd.university.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ibatis.common.resources.Resources;
import com.solvd.university.dao.IBookDAO;
import com.solvd.university.dao.ILibraryDAO;
import com.solvd.university.model.Book;
import com.solvd.university.model.Library;

public class LibraryDAO implements ILibraryDAO{
	private static Logger log = LogManager.getLogger(BookDAO.class);
	
	@Override
	public boolean removeById(Long id) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ILibraryDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ILibraryDAO.class);
			
			bhDao.removeById(id);
			return true;
		} catch (IOException e) {
			log.error(e);
		}
		return false;
	}

	@Override
	public Library getById(Long id) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ILibraryDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ILibraryDAO.class);
			if(bhDao.getById(id) != null)
				return bhDao.getById(id);
		} catch (IOException e) {
			log.error(e);
		}
		return new Library();
	}

	@Override
	public List<Library> getAll() {
	
		InputStream inputStream;
	try {
		inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	    ILibraryDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ILibraryDAO.class);
				return bhDao.getAll();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		log.error(e);;
	}
	
	
	return new ArrayList<Library>();
	}

	@Override
	public Library save(Library b) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
