package com.example.Customer.Customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    private Integer id;
    private String name;
    private String place;
    private String gender;
    private String fav_product;
    
    
    
	public Customer(Integer id, String name, String place, String gender, String fav_product) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.gender = gender;
		this.fav_product = fav_product;
	}
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFav_product() {
		return fav_product;
	}
	public void setFav_product(String fav_product) {
		this.fav_product = fav_product;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", place=" + place + ", gender=" + gender + ", fav_product="
				+ fav_product + "]";
	}
    
    
    
    
    
    
}
