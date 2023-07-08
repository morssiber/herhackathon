package de.herhackathon.backendservice.repository;

import de.herhackathon.backendservice.model.db.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {

    //List<ArticleEntity>
}
