package com.nathanjekel.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	//@Value("#{T(java.lang.Math).abs(-99)}")
	//@Value("#{new Integer(88)}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;
	
	@Value("#{'Nathan Jekel'.toUpperCase()}")
	private String name;
	
	@Value("#{classes}")
	private List<String> classes;
	
	@Autowired
	private Profile profile;
	
	@Value("#{6>5}")
	private boolean active;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", classes=" + classes + ", profile=" + profile + ", active="
				+ active + "]";
	}

	
	

}
