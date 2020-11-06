package com.solvd.university.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.hospital.Main;
import com.solvd.university.dao.interfaces.IDepartmentDAO;
import com.solvd.university.model.Department;

public class DepartmentDAO extends MySQLDAO implements IDepartmentDAO{

	private Connection con;
	private static final String INSERT = "INSERT INTO Department(name) VALUES(?)";
	private static final String DELETE = "DELETE FROM Department WHERE id = ?";
	private static final String GETBYID = "SELECT * FROM Department WHERE id = ?";
	private Logger log = LogManager.getLogger(DepartmentDAO.class);
	public DepartmentDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Department b) {
		PreparedStatement stat = null;
		
        try{
        	con=connection.getConnection();
            stat= con.prepareStatement(INSERT);
           
            stat.setString(1, b.getName());
      
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
            }try {
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
            }
            try {
				connection.releaseConnection(con);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
        } 
	}

	@Override
	public Department getById(long id) {
		PreparedStatement stat=null;
		ResultSet rs=null;
		Department depto=null;
		try{
			con=connection.getConnection();
			stat=con.prepareStatement(GETBYID);
			stat.setLong(1,id);
			rs=stat.executeQuery();
			if(rs.next()){
				depto = new Department(rs.getLong("id"),rs.getString("name"),null);
			}
			else {
				log.info("Cannot find Department with id= "+id);
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
		return depto;

	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
