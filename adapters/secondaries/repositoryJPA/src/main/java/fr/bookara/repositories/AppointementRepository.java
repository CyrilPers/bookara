package fr.bookara.repositories;

import fr.bookara.entities.Appointement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointementRepository extends JpaRepository<Appointement, Integer> {
    List<Appointement> findByCustomerId(int idCustomer);
}
