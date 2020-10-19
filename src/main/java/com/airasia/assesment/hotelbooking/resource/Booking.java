package com.airasia.assesment.hotelbooking.resource;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Booking.
 * 
 * @author Suchita
 */
@Getter
@Setter
@Entity
@Table(name = "Booking")
public class Booking {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
	long id;

	/** The name. */
	@Column(name = "booking_name")
	private String name;

	/** The check in. */
	@Column(name = "check_in")
	private Date checkIn;

	/** The check out. */
	@Column(name = "check_out")
	private Date checkOut;

	/** The customer info. */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customerInfo;

	/** The room info. */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "room_id", referencedColumnName = "room_id")
	private Room roomInfo;

	/** The total amount. */
	@Column(name = "total_Amount")
	private double totalAmount;
}
