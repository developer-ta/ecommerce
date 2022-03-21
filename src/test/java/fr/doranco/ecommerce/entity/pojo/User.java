package fr.doranco.ecommerce.entity.pojo;

import java.util.Date;

import javax.persistence.Id;

import org.mockito.internal.verification.NoMoreInteractions;

import antlr.collections.impl.LList;
import fr.doranco.ecommerce.enums.EnumProfile;

public class User {
	
	private int id;
	private String firstName ;	
	private String lastName;
	private String birthday;	
	private EnumProfile profile;
	private boolean  isActif;
	private String password;
	private String email;
	private String phone;
	private int address_id;
	private int order_id;
	private int  paymentCard_id;
	private int comment_id;
    //private List<ArticleCart> cart;
}
