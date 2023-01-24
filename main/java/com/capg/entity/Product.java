package com.capg.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="product100")
public class Product {
	
	@Id
	private int pid;
	private String prodName;
	private String prodCategory;
	private int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String prodName, String prodCategory, int price) {
		super();
		this.pid = pid;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
