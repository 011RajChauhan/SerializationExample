package com.prac.serlization;

import java.io.Serializable;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8360376999314949333L;
	private String name;
	private int age;
	private transient Address stdAddress;
	
	public Student(String name, int age,String address) {
		this.name = name;
		this.age = age;
		stdAddress = new Address(address);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public String getStdAddress() {
		if(stdAddress==null){
			return "address not serialized";
		}
		return stdAddress.getStdAddress();
	}

}
