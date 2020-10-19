package com.airasia.assesment.hotelbooking.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Customer.
 * 
 * @author Suchita
 */
@Getter
@Setter
@Entity
@Table(name = "Customer")
public class Customer {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	long id;

	/** The name. */
	@Column(name = "customer_name")
	private String name;

	/** The mail. */
	@Column(name = "customer_mail")
	private String mail;

	/** The phone number. */
	@Column(name = "phone_number")
	private String phoneNumber;
}
