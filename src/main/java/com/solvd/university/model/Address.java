package com.solvd.university.model;

public class Address extends AbstractEntity {

	private String addr;
	private float coordslat;
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
