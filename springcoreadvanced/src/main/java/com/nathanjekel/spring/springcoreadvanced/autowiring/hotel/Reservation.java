package com.nathanjekel.spring.springcoreadvanced.autowiring.hotel;

public class Reservation {

	private int id;
	private String time;

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
