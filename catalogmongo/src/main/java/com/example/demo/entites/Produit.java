package com.example.demo.entites;

import java.io.Serializable;



import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="produit")
public class Produit implements Serializable {
	
	
	private String id;
	private String description;
	private double prix;
	
	
	
	public Produit(String id, String description, double prix) {
		super();
		this.id = id;
		this.description = description;
		this.prix = prix;
	}



	public Produit(String description, double prix) {
		super();
		this.description = description;
		this.prix = prix;
	}



	public Produit() {
		super();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	

}
