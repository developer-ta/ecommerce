package fr.doranco.ecommerce.entity.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int id;
	
	private String number;
	private String street;
	private String city;
	private String postCode;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private int user_id;

}
