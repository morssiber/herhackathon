package de.herhackathon.backendservice.repository;

import de.herhackathon.backendservice.model.db.CommunityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<CommunityEntity, Integer> {
}
