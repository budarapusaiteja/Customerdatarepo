package com.sample.sampledata;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Control {
	@Autowired
	Services s;
	@GetMapping("/getbyid/{id}")
	public CustomerTable getby(@PathVariable int id) throws custexception2 {
		CustomerTable u=s.getid(id);
		return u;
	}
	@GetMapping("/getall")
	public List<CustomerTable> getall() {
		return s.getAll();
	}
	
}
