package com.solvd.university.parser;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.xml.validation.Schema;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.university.model.Library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbParserLibrary{
	
	private static final String schema = "src/main/resources/schema.xsd";
	private static Logger log = LogManager.getLogger(JaxbParserLibrary.class);

	public  Optional<Library> getLibrary(String fileName){

        try {
            JAXBContext context = JAXBContext.newInstance( Library.class );
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Library c = (Library)unmarshaller.unmarshal(new File(fileName));
            return Optional.of(c);             
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            log.error(e);
        }
		return Optional.empty();
	}
	
	public static void writeXMLFile(Library lib, String fileName) {
		//static method for App to call
		JAXBContext c;
		try {
			

			c = JAXBContext.newInstance(Library.class);
			
			Marshaller mar = c.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			mar.marshal(lib, System.out);
			mar.marshal(lib, new File(fileName));
			
		} catch (JAXBException e) {
			log.error(e);
		}
	}
}
