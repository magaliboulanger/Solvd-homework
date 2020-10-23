package com.solvd.connectionpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyConnectionPool {

	private final int MAX_SIZE;
	private int usedConnections;
	private String url;
	private BlockingQueue<Object> connectionPool;//Instead Object will be a class that implements Connection


	public MyConnectionPool(int size) {
		MAX_SIZE=size;
		this.connectionPool=new ArrayBlockingQueue<Object>(MAX_SIZE);
		this.url=null;
		this.usedConnections=0;
	}


	public Object getConnection() throws InterruptedException{
		synchronized(MyConnectionPool.class) {
			if(usedConnections<MAX_SIZE)
			{
				connectionPool.put(new Object());
				usedConnections++;
			}
				
		}
		return connectionPool.take();

	}



	public boolean releaseConnection(Object connection) throws InterruptedException {
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
