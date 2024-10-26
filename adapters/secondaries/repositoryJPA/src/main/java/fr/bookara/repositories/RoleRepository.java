package fr.bookara.repositories;

import fr.bookara.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<fr.bookara.entities.Role, Integer> {
    Role findById(int id);
}
