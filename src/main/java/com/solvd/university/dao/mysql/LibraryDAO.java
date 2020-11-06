package com.solvd.university.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.interfaces.ILibraryDAO;
import com.solvd.university.model.Library;

public class LibraryDAO extends MySQLDAO implements ILibraryDAO {
	private Connection con;
	private static final String INSERT = "INSERT INTO Library(name,address) VALUES(?,?)";
	private static final String DELETE = "DELETE FROM Library WHERE id = ?";
	private static final String GETBYID = "SELECT * FROM Library WHERE id = ?";
	private Logger log = LogManager.getLogger(LibraryDAO.class);
	public LibraryDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Library b) {

		PreparedStatement stat = null;
        try{
        	con=connection.getConnection();
            stat= con.prepareStatement(INSERT);
           
            stat.setString(1, b.getName());
            stat.setString(2, b.getAddress());
      
            if(stat.executeUpdate()==0){
              log.info("It may not have been saved.");
            }
            
            return true;
        } catch (SQLException | InterruptedException ex) {
           log.error(ex);
           return false;
        } finally {
            if (stat!=null){
                try {
                    stat.close();
                } catch (SQLException ex ) {
                    log.error(ex);
                }
            } try {
				connection.releaseConnection(con);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
        
        }
	}

	@Override
	public boolean removeById(long id) {
		PreparedStatement stat = null;
        try{
        	con=connection.getConnection();
            stat= con.prepareStatement(DELETE);
            stat.setLong(1,id);
            stat.execute();
            return true;
        } catch (SQLException | InterruptedException ex) {
            log.error(ex);
    		return false;
        }finally {
            if (stat!=null){
                try {
                    stat.close();
                } catch (SQLException ex ) {
                	log.error(ex);
                }
            } try {
				connection.releaseConnection(con);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
        
        } 
	}

	@Override
	public Library getById(long id) {
		PreparedStatement stat=null;
		ResultSet rs=null;
		Library t=null;
		try{
			con=connection.getConnection();
			stat=con.prepareStatement(GETBYID);
			stat.setLong(1,id);
			rs=stat.executeQuery();
			if(rs.next()){
				t = new Library(rs.getLong("id"),rs.getString("name"),rs.getString("address"),null);
			}
			else {
				log.info("Cannot find Teacher with id= "+id);
			}
		}catch (SQLException | InterruptedException ex){
			log.error(ex);
		}finally{
			if(rs!=null){
				try{
					rs.close();
				} catch (SQLException ex) {
					log.error(ex);
				}
			}
			if(stat!= null){
				try{
					stat.close();
				} catch (SQLException ex) {
					log.error(ex);
				}
			}
			 try {
					connection.releaseConnection(con);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					log.error(e);
				}
		}
		return t;
	}

	@Override
	public ArrayList<Library> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
