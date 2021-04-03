package com.springDemo.spEx.lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	// create exprn
	@Value("#{ 11 + 95 }")
	private int x;

	@Value("#{ 10 > 5 ? 11 : 44 }")
	private int y;

	// calling static method..
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double z;

	// calling static variable value
	@Value("#{ T(java.lang.Math).E }")
	private double e;

	// calling static variable value
	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	// creating object and call its constructer
	@Value("#{ new java.lang.String('Hitesh Ahire') }")
	private String name;

	//assine a boolean value 
	@Value("#{ 4>3 }")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}

}
