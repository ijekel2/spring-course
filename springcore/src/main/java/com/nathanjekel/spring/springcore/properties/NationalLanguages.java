package com.nathanjekel.spring.springcore.properties;

import java.util.Properties;

public class NationalLanguages {

	private Properties nationalLanguages;

	public Properties getNationalLanguages() {
		return nationalLanguages;
	}

	public void setNationalLanguages(Properties nationalLanguages) {
		this.nationalLanguages = nationalLanguages;
	}

	@Override
	public String toString() {
		return "NationalLanguages [nationalLanguages=" + nationalLanguages + "]";
	}

}
