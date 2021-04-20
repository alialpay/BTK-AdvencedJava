package com.springdemo;

import org.springframework.stereotype.Component;

public class MsSqlCustomerDal implements ICustomerDal {

String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		System.out.println("Connetion String : "+this.connectionString);
		System.out.println("MsSql veritabanưna eklendi");
		
	}

}
