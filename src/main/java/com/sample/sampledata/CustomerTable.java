package com.sample.sampledata;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "CustomerTable", schema = "customerdata")
public class CustomerTable {
	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	@Override
	public String toString() {
		return "CustomerTable [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public CustomerTable(Integer id, String name, Integer age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	CustomerTable(){
		
	}
}
