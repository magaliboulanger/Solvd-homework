package com.solvd.university.parser;


import javax.xml.validation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.xml.transform.stax.*;
import javax.xml.stream.*;
import javax.xml.*;
import java.io.*;

public class StaxSchemaValidation {
	private static Logger log = LogManager.getLogger(StaxSchemaValidation.class);
	
    public static void main (String args[]) throws Exception {

        XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new FileInputStream("./src/main/resources/demo.xml"));

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File("./src/main/resources/schema.xsd"));

        Validator validator = schema.newValidator();
        validator.validate(new StAXSource(reader));

      
        log.info("Document is valid");

    }
}