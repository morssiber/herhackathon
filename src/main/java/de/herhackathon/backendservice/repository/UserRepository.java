package de.herhackathon.backendservice.repository;

import de.herhackathon.backendservice.model.db.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
