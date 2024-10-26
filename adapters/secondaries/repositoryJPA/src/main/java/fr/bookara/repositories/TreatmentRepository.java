package fr.bookara.repositories;

import fr.bookara.entities.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Integer> {

    Treatment save(Treatment treatment);
}
