package com.solvd.university.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address extends AbstractEntity {

	@XmlElement(name="place") 
	private String addr;
	@XmlElement(name="lat") 
	private float coordslat;
	@XmlElement(name="lon") 
	private float coordslon;
	public Address(long id, String addr, float coor,  float coorlo) {
		super(id);
		this.addr = addr;
		this.coordslat = coor;
		this.coordslon = coorlo;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + ", coordslat=" + coordslat + ", coordslon=" + coordslon + "]";
	}

	public Address() {
		this.addr = null;
		this.coordslat = 0;
		this.coordslon = 0;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public float getCoordslat() {
		return coordslat;
	}
	public void setCoordslat(float coordslat) {
		this.coordslat = coordslat;
	}
	public float getCoordslon() {
		return coordslon;
	}
	public void setCoordslon(float coordslon) {
		this.coordslon = coordslon;
	}
	
	
}
