package com.citi.MySpring.InnerBean;

public class Person {
	
	private String name;
	private int age;
	private Address addrs;
	
	
	public Address getAddrs() {
		return addrs;
	}
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addrs=" + addrs + "]";
	} 
	
	
	
	
}
