package com.solvd.university.parser;



import java.io.File;
import java.io.IOException;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.university.model.Library;


public class MyJsonLibraryParser {
	private static Logger logger = LogManager.getLogger(MyJsonLibraryParser.class);
	private static ObjectMapper mapper = new ObjectMapper();
	
	
	public static void writeJsonFile(Library lib, String fileName) {

		String jsonObj = null;
		
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), lib);
			jsonObj = FileUtils.readFileToString(new File(fileName), "UTF-8");
			logger.info("\nGenerated Json: \n" + jsonObj + "\n");
			
		} catch (IOException e) {
			logger.error(e);
		}
		
	}
	
	public static Optional<Library> getLibraryFromJson(String fileName) {
		try {
			return Optional.of(mapper.readValue(fileName, Library.class));
		} catch (JsonProcessingException  e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return Optional.empty();
	}


}
