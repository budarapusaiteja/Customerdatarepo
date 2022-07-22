package com.sample.sampledata;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Services implements ServiceInterface{
	@Autowired
	JpaData i;
	public CustomerTable getid(Integer j){
		try {
		if(i.findById(j)==null) {
			throw new custexception2("id not present, cannot enter the correct input");
		}
		}
		catch(custexception2 c) {
			System.out.println("id not found"+c);
		}
		return i.findById(j).get();
	}
	@Override
	public List<CustomerTable> getAll() {
		// TODO Auto-generated method stub
		return i.findAll();
	} 
}
