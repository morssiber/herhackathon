package de.herhackathon.backendservice.service;

import de.herhackathon.backendservice.model.db.ArticleEntity;
import de.herhackathon.backendservice.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ArticleService {

    private ArticleRepository articleRepository;

    public List<ArticleEntity> getArticlesByIds(List<Integer> ids) {
        log.info("getArticlesByIds for ids: {}", ids);
        return articleRepository.findAllById(ids);
    }
}
