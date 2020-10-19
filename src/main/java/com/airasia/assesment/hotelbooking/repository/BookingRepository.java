package com.airasia.assesment.hotelbooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airasia.assesment.hotelbooking.resource.Booking;

/**
 * The Interface BookingRepository.
 */
@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {

}
