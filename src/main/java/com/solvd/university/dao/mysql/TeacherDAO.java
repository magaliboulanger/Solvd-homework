package com.solvd.university.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.interfaces.ITeacherDAO;
import com.solvd.university.model.Teacher;

public class TeacherDAO extends MySQLDAO  implements ITeacherDAO{
	private Connection con;
	private static final String INSERT = "INSERT INTO Teacher(name,department_id,phone_number,email) VALUES(?,?,?,?)";
	private static final String DELETE = "DELETE FROM Teacher WHERE id = ?";
	private static final String GETBYID = "SELECT * FROM Teacher WHERE id = ?";
	private static final String GETBYDEPTOID = "SELECT * FROM Teacher WHERE department_id = ?";
	private Logger log = LogManager.getLogger(TeacherDAO.class);
	public TeacherDAO(MyConnectionPool connection) {
		
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Teacher b, long idDepartment) {
		
		PreparedStatement stat = null;
        try{
        	con=connection.getConnection();
            stat= con.prepareStatement(INSERT);
           
            stat.setString(1, b.getName());
            stat.setLong(2, idDepartment);
            stat.setString(3, b.getPhone());
            stat.setString(4, b.getEmail());
      
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
	public Teacher getById(long id) {
		PreparedStatement stat=null;
		ResultSet rs=null;
		Teacher t=null;
		try{
			con=connection.getConnection();
			stat=con.prepareStatement(GETBYID);
			stat.setLong(1,id);
			rs=stat.executeQuery();
			if(rs.next()){
				t = new Teacher(rs.getLong("id"),rs.getString("name"),rs.getString("phone_number"),rs.getString("email"));
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
	public ArrayList<Teacher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Teacher> getByDepartmentId(long id) {
		PreparedStatement stat=null;
		ResultSet rs=null;
		ArrayList<Teacher> t= new ArrayList<Teacher>();
		try{
			stat=con.prepareStatement(GETBYDEPTOID);
			stat.setLong(1,id);
			rs=stat.executeQuery();
			while(rs.next()){
				t.add(new Teacher(rs.getLong("id"),rs.getString("name"),rs.getString("phone_number"),rs.getString("email")));
			}
			
		}catch (SQLException ex){
			log.error(ex);
		}finally{
			if((rs!=null)||(stat!= null)){
				try{
					rs.close();
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

}
