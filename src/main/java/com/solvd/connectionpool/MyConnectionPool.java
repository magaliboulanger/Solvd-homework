package com.solvd.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyConnectionPool {

	private final int MAX_SIZE;
	private int usedConnections;
	private final String URL ="jdbc:mysql://localhost:33060/";
	private final String DB_NAME ="mydb";
	private final String DRIVER ="com.mysql.cj.jdbc.Driver";
	private final String USER_NAME ="root";
	private final String PASSWORD ="secret";

	private static Logger l= LogManager.getLogger(MyConnectionPool.class);
	private BlockingQueue<Connection> connectionPool;//Instead Object will be a class that implements Connection


	public MyConnectionPool(int size) {
		MAX_SIZE=size;
		this.connectionPool=new ArrayBlockingQueue<Connection>(MAX_SIZE);
		this.usedConnections=0;
	}


	public Connection getConnection() throws InterruptedException{
		synchronized(MyConnectionPool.class) {
			if(usedConnections<MAX_SIZE)
			{
				try {
					Class.forName(DRIVER).newInstance();
					connectionPool.put(DriverManager.getConnection(URL+DB_NAME,USER_NAME, PASSWORD));
				} catch (InterruptedException | SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					l.error(e);
				}
				usedConnections++;
			}
				
		}
		return connectionPool.take();

	}



	public boolean releaseConnection(Connection connection) throws InterruptedException {
		connectionPool.put(connection);
		usedConnections--;
		return true;
	}


	public void closeAll() {
		connectionPool.stream().filter(c->c!=null).forEach(c->{
			//c.close();
		});
		connectionPool.clear();
		usedConnections=0;
	}
}
