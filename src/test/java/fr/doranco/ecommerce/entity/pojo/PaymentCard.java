package fr.doranco.ecommerce.entity.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PaymentCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstNameOwner;
	private String lastNameOwner; 
	private byte[]  encrypt;
	private int user_id;
	
}

