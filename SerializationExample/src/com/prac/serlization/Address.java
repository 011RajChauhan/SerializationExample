package com.prac.serlization;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String stdAddress;
	
	public Address(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

}	
