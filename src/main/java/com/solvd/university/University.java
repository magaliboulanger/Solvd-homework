package com.solvd.university;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.interfaces.*;
import com.solvd.university.dao.mysql.*;
import com.solvd.university.model.*;
import com.solvd.university.services.*;

import jdk.internal.org.jline.utils.Log;

public class University extends AbstractEntity {

	private static Logger log = LogManager.getLogger(University.class);
	
	public static void main (String [] args ) {
		MyConnectionPool mcp = new MyConnectionPool(10);
		
		//DEPARTMENT SERVICE
		IDepartmentDAO d = new DepartmentDAO(mcp);
		ITeacherDAO t = new TeacherDAO(mcp);
		Teacher t1= new Teacher(01,"Martin", "123456", "martin@martin.com");
		Teacher t2= new Teacher(02,"Lucas", "123456", "lucas@gmail.com");
		Teacher t3= new Teacher(03,"Maria", "123456", "maria@gmail.com");
		List<Teacher> teachers=new ArrayList<Teacher>();
		teachers.add(t3);
		teachers.add(t2);
		teachers.add(t1);
		Department dep = new Department(14,"Geography",teachers);
		d.save(dep);
		t.save(t3,01);
		t.save(t2,01);
		t.save(t1,01);
		DepartmentService ds=new DepartmentService(t,d);
		Department dept = ds.getById(01);
		log.info(dept.toString());
		
		
		
		//LIBRARY SERVICE
		Book b1 = new Book(01,"Hello", "M.L.K", 120, 2020);
		Book b2 = new Book(02,"Sunset", "S.K", 520, 2017);
		Book b3 = new Book(03,"Wake up", "H.I", 700, 2019);
		List<Book> books = new ArrayList<Book>();
		books.add(b3);
		books.add(b2);
		books.add(b1);
		Library l1= new Library(01, "Sarmiento", "street 123", books);
		ILibraryDAO l=new LibraryDAO(mcp);
		l.save(l1);
		IBookDAO b= new BookDAO(mcp);
		b.save(b1,01);
		b.save(b2,01);
		b.save(b3,01);
		LibraryService ls= new LibraryService(b,l);
		Library lib=ls.getById(1);
		log.info(lib.toString());
		
		}
}
