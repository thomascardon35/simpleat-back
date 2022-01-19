package fr.cardon.simpleat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cardon.simpleat.model.Reservation;
import fr.cardon.simpleat.model.ReservationPK;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, ReservationPK> {

}
