package fr.doranco.ecommerce.entity.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int discount;
	private boolean isDiscountCumulative;
	private String photo;
	private int product_id;
	
}
