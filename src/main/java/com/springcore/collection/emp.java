package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class emp {
	
	private String name;
	private List<String> phone;
	private Set<String> addressess;
	private Map<String, String> courses;
	private Properties coursedetail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddressess() {
		return addressess;
	}
	public void setAddressess(Set<String> addressess) {
		this.addressess = addressess;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getCoursedetail() {
		return coursedetail;
	}
	public void setCoursedetail(Properties coursedetail) {
		this.coursedetail = coursedetail;
	}
	public emp(String name, List<String> phone, Set<String> addressess, Map<String, String> courses,
			Properties coursedetail) {
		super();
		this.name = name;
		this.phone = phone;
		this.addressess = addressess;
		this.courses = courses;
		this.coursedetail = coursedetail;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
