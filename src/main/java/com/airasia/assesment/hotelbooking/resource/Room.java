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
 * The Class Room.
 * 
 * @author Suchita
 */
@Getter
@Setter
@Entity
@Table(name = "Room")
public class Room {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "room_id")
	long id;

	/** The name. */
	@Column(name = "room_name")
	private String name;

	/** The total guest. */
	@Column(name = "capacity")
	private int totalGuest;

	/** The status. */
	@Column(name = "status")
	private String status;
}
