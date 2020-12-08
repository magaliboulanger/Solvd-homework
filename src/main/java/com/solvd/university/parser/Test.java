package com.solvd.university.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.university.model.Address;
import com.solvd.university.model.Book;
import com.solvd.university.model.Library;

public class Test {

	private static Logger log = LogManager.getLogger(Test.class);

	public static void main (String [] args) {
		
		Book b1 = new Book(01, "Title 1", "Author 1", 100, 2010);
		Book b2 = new Book(02, "Title 2", "Author 2", 450, 2000);
		Book b3 = new Book(03, "Title 3", "Author 3", 150, 2003);
		List<Book> books = new ArrayList<Book> ();
		books.add(b3);
		books.add(b2);
		books.add(b1);
		Address addr = new Address(01, "street 456", (float)-35.345, (float)-58.848);
		Library lib = new Library(01,"Sarm", addr, books);
		JaxbParserLibrary.writeXMLFile(lib, "./src/main/resources/demo.xml");
		
		MyJsonLibraryParser.writeJsonFile(lib, "./src/main/resources/demo.json");
		
		Optional<Library> l = MyJsonLibraryParser.getLibraryFromJson("./src/main/resources/demo.json");
		
		if(l.isPresent())
			log.info(l.toString());
	}
}
