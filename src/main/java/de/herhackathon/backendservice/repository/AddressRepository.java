package de.herhackathon.backendservice.repository;

import de.herhackathon.backendservice.model.db.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
}
