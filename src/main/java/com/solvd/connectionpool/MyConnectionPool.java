package com.solvd.connectionpool;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyConnectionPool {

	private final int MAX_SIZE;
	private AtomicInteger usedConnections;

	private static Logger l= LogManager.getLogger(MyConnectionPool.class);
	private BlockingQueue<Connection> connectionPool;//Instead Object will be a class that implements Connection


	private MyConnectionPool(int size) {
		MAX_SIZE=size;
		this.connectionPool=new ArrayBlockingQueue<Connection>(MAX_SIZE);
		this.usedConnections.set(0);;
	}


	public Connection getConnection() throws InterruptedException{
		synchronized(MyConnectionPool.class) {
			if(usedConnections.get()<MAX_SIZE)
			{
				try {
					Properties prop = new Properties();
					prop.load(new FileInputStream("database.properties"));
					Class.forName(prop.getProperty("DRIVER")).newInstance();
					connectionPool.put(DriverManager.getConnection(prop.getProperty("URL")+prop.getProperty("DB_NAME"),prop.getProperty("USER_NAME"), prop.getProperty("PASSWORD")));
				} catch (InterruptedException | SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					l.error(e);
				}
				usedConnections.addAndGet(1);
			}
				
		}
		return connectionPool.take();

	}



	public boolean releaseConnection(Connection connection) throws InterruptedException {
		connectionPool.put(connection);
		usedConnections.decrementAndGet();
		return true;
	}


	public void closeAll() {
		connectionPool.stream().filter(c->c!=null).forEach(c->{
			//c.close();
		});
		connectionPool.clear();
		usedConnections.set(0);;
	}
}
