package fr.doranco.ecommerce.entity.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private float price;
	private int discount;
	private int Stock;
	private boolean isVendable;
	private String[] photos;
	private String[] videos;
	
}
