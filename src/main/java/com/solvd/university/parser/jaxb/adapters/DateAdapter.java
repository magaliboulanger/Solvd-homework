package com.solvd.university.parser.jaxb.adapters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date>{

	private static final String CUSTOM_FORMAT_STRING = "dd-MM-yyyy";

	@Override
	public String marshal(Date v) {
		return new SimpleDateFormat(CUSTOM_FORMAT_STRING).format(v);
	}
	@Override
	public Date unmarshal(String v) throws ParseException {
		return new SimpleDateFormat(CUSTOM_FORMAT_STRING).parse(v);
	}

}
