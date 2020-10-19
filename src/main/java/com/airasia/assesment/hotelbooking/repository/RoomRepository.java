package com.airasia.assesment.hotelbooking.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airasia.assesment.hotelbooking.resource.Room;

/**
 * The Interface RoomRepository.
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

	/**
	 * Find all by status.
	 *
	 * @param string the string
	 * @return the optional
	 */
	Optional<ArrayList<Room>> findAllByStatus(String string);
}
