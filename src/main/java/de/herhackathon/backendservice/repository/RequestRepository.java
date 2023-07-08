package de.herhackathon.backendservice.repository;

import de.herhackathon.backendservice.model.db.RequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestEntity, Integer> {
}
