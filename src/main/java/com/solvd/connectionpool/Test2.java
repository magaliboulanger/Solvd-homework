package com.solvd.connectionpool;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test2 implements Runnable{


	private static Logger l= LogManager.getLogger(Main.class);
	private MyConnectionPool pool;
	private Object con;
	public Test2(MyConnectionPool p)
	{
		this.pool=p;
	}
	@Override
	public void run() {
		
		try {
			con = pool.getConnection();
			l.info("Connection was obtained.");
			Thread.sleep(5000);
			l.info("Connection was free.");
			pool.releaseConnection(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			l.error("",e);
		}
	}

}
