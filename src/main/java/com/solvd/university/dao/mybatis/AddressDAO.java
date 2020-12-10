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
import com.solvd.university.dao.IAddressDAO;
import com.solvd.university.model.Address;

public class AddressDAO implements IAddressDAO {

	private static Logger log = LogManager.getLogger(AddressDAO.class);
	
	@Override
	public boolean removeById(Long id) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			IAddressDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IAddressDAO.class);
			
			bhDao.removeById(id);
			return true;
		} catch (IOException e) {
			log.error(e);
		}
		return false;
	}

	@Override
	public Optional<Address> getById(Long id) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			IAddressDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IAddressDAO.class);
			if(bhDao.getById(id) != null)
				return (bhDao.getById(id));
		} catch (IOException e) {
			log.error(e);
		}
		return Optional.empty();
	}

	

	@Override
	public List<Address> getAll() {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			IAddressDAO bhDao = sqlSessionFactory.openSession(true).getMapper(IAddressDAO.class);
			
			return bhDao.getAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error(e);;
		}
		
		
		return new ArrayList<Address>();
	}

}
