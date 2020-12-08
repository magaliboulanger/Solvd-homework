package com.solvd.university.dao.mybatis;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBatisUtils {

	private static SqlSessionFactory instance;
	private static final Logger LOGGER = LogManager.getLogger(MyBatisUtils.class);
	
	public static SqlSessionFactory getInstance() {
		if (instance == null) {
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			} catch (IOException e) {
				LOGGER.error(e);
			}
			instance = new SqlSessionFactoryBuilder().build(inputStream);
		}
		return instance;
	}
}