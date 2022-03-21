package fr.doranco.ecommerce.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.mockito.internal.verification.NoMoreInteractions;

import antlr.collections.List;
import antlr.collections.impl.LList;
import fr.doranco.ecommerce.enums.EnumProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //GETTER SETTER
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@ToString
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;
	private String firstName ;	
	private String lastName;
	private String birthday;	
	private EnumProfile profile;
	private boolean  isActif;
	private String password;
	private String email;
	private String phone;
	
	@OneToMany(cascade =  CascadeType.ALL) 
	@JoinColumn(name = "address_id" )
	private ArrayList<Address> address;
	
	@OneToMany(cascade =  CascadeType.ALL) 
	@JoinColumn(name = "order_id" )
	private ArrayList<Order> order;
	
	@OneToMany(cascade =  CascadeType.ALL) 
	@JoinColumn(name = "paymentCard_id" )
	private ArrayList<PaymentCard> paymentCard;
	
	@OneToMany(cascade =  CascadeType.ALL) 
	@JoinColumn(name = "comment_id" )
	private ArrayList<Comment> comment;
	
	@OneToMany(cascade =  CascadeType.ALL) 
	@JoinColumn(name = "card_id" )
    private ArrayList<Cart> cart;

	
}
