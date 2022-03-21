package fr.doranco.ecommerce.entity.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int  amount;
	private float  unitPrice;
	private int productDiscount;
	private int order_id;
	private int product_id;
	
}
