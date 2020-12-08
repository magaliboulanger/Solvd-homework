package com.solvd.university.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.university.model.Address;
import com.solvd.university.model.Book;
import com.solvd.university.model.Library;

public class StAXParserLibrary {
	private static Logger log = LogManager.getLogger(StAXParserLibrary.class);

	public static void main( String[] args )
	{

		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader eventReader;
		try {
			eventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("./src/main/resources/demo.xml"));

			Book book = new Book();
			List<Book> books = new ArrayList<Book>();
			Address addr = null;
			List <Library> libs = new ArrayList<Library>();
			Library lib = null;
			while(eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();
				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					switch (startElement.getName().getLocalPart()) {
					case "library":
						lib = new Library();
						Attribute id = startElement.getAttributeByName(new QName("id"));
						if (id != null) {
							lib.setId(Long.parseLong(id.getValue()));
						}
						break;
					case "name":
						event = eventReader.nextEvent();
						lib.setName(event.asCharacters().getData());
						break;
					case "address":
						addr = new Address();	
						break;
					case "place":
						event = eventReader.nextEvent();
						addr.setAddr(event.asCharacters().getData());
						break;
					case "coords":

						break;
					case "lat":
						event = eventReader.nextEvent();
						addr.setCoordslat(Float.parseFloat(event.asCharacters().getData()));
						break;
					case "lon":
						event = eventReader.nextEvent();
						addr.setCoordslon(Float.parseFloat(event.asCharacters().getData()));
						break;
					case "book":
						book=new Book();
						break;
					case "title":
						event = eventReader.nextEvent();
						book.setTitle(event.asCharacters().getData());
						break;
					case "author":
						event = eventReader.nextEvent();
						book.setAuthor(event.asCharacters().getData());
						break;
					case "numPages":
						event = eventReader.nextEvent();
						book.setNum_pages(Integer.parseInt(event.asCharacters().getData()));
						break;
					case "year":
						event = eventReader.nextEvent();
						book.setYear(Integer.parseInt(event.asCharacters().getData()));
						break;
					}
				}
			if (event.isEndElement()) {
				EndElement endElement = event.asEndElement();
				if (endElement.getName().getLocalPart().equals("library")) {
					lib.setBooks(books);
					libs.add(lib);
					log.info(lib.toString());
				}else if (endElement.getName().getLocalPart().equals("book")) {
					books.add(book);
					books.clear();
				}
				if (endElement.getName().getLocalPart().equals("address")) {
					lib.setAddress(addr);
				}
			}
		}

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (XMLStreamException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

