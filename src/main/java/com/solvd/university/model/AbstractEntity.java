package com.solvd.university.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="library") 
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AbstractEntity {
	@XmlAttribute(name="id")
	private long id;

	public AbstractEntity(long id) {
		super();
		this.id = id;
	}
	
	public AbstractEntity() {
		this.id = 0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
}
