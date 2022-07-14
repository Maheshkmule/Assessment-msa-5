package com.com.azurepipeline.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Device {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String category;
    private long price;
	public Device(int id, String name, String category, long price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
    
    
	
    
}