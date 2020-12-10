package com.solvd.university.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ibatis.common.resources.Resources;
import com.solvd.university.dao.IBookDAO;
import com.solvd.university.model.Book;

public class BookDAO implements IBookDAO {
	
	private static Logger log = LogManager.getLogger(BookDAO.class);
		@Override
		public Optional<Book> getById(Long id) {
			try {
				InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

				IBookDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IBookDAO.class);
				if(bhDao.getById(id) != null)
					return bhDao.getById(id);
			} catch (IOException e) {
				log.error(e);
			}
			return Optional.empty();
		}

		@Override
		public boolean removeById(Long id) {
			try {
				InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

				IBookDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IBookDAO.class);
				
				bhDao.removeById(id);
				return true;
			} catch (IOException e) {
				log.error(e);
			}
			return false;
		}


		
		@Override
		public List<Book> getAll() {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

				IBookDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IBookDAO.class);
				
				return bhDao.getAll();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);;
			}
			
			
			return new ArrayList<Book>();
		}

		@Override
		public Book save(Book b, long idLib) {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

				IBookDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IBookDAO.class);
				bhDao.save(b, idLib);
				return b;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);;
			}
			return new Book();
		}

		@Override
		public List<Book> getByLibId(Long id) {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

				IBookDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IBookDAO.class);
				
				return bhDao.getByLibId(id);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);;
			}
			return new ArrayList<Book>();
		}

	}


