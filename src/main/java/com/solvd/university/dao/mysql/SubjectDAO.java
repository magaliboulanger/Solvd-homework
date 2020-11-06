package com.solvd.university.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.interfaces.ISubjectDAO;
import com.solvd.university.model.Subject;

public class SubjectDAO extends MySQLDAO implements ISubjectDAO {
	private Connection con;
	private static final String INSERT = "INSERT INTO Subject(name, hours, credits) VALUES(?,?,?)";
	private static final String DELETE = "DELETE FROM Subject WHERE id = ?";
	private static final String GETBYID = "SELECT * FROM Subject WHERE id = ?";
	private Logger log = LogManager.getLogger(SubjectDAO.class);
	public SubjectDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Subject b) {
		PreparedStatement stat = null;
        try{
        	con=connection.getConnection();
            stat= con.prepareStatement(INSERT);
           
            stat.setString(1, b.getName());
            stat.setInt(2, b.getHours() );
            stat.setInt(3, b.getCredits());
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Subject getById(long id) {
		PreparedStatement stat=null;
		ResultSet rs=null;
		Subject t=null;
		try{
			con=connection.getConnection();
			stat=con.prepareStatement(GETBYID);
			stat.setLong(1,id);
			rs=stat.executeQuery();
			if(rs.next()){
				t = new Subject(rs.getLong("id"),rs.getString("name"),rs.getInt("hours"),rs.getInt("credits"));
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
	public List<Subject> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
