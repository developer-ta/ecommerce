package fr.doranco.ecommerce.entity.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int id;
	private int number;
	private String dateCreate;
	private String dateDelivery;
	private int totalDiscount;
	private int chargeDelivery;
	private int totalPrice;
	private int addressBilling_id;
	private int  addressDelivery_id;
	private int  defaultPaymentCard_id;
	private int user_id;
	private int orderLine_id;
	
}
