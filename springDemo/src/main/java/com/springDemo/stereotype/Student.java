package com.springDemo.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//default object-name is 'student ' but u can change it as temp

//Singleton , Prototype
@Scope("prototype")
@Component("temp")
public class Student {
	@Value("Hitesh Bhagwan Ahire")
	private String name;

	@Value("Malegaon Nashik")
	private String city;

	@Value("#{dataset}")
	private List<String> address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}

}
