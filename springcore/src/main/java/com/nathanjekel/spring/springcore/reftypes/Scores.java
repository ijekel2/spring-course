package com.nathanjekel.spring.springcore.reftypes;

public class Scores {

	private Double math;
	private Double physics;
	private Double chemistry;

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "Scores [math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	

}
