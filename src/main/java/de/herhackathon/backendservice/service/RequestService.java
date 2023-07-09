package de.herhackathon.backendservice.service;

import de.herhackathon.backendservice.model.RequestStatus;
import de.herhackathon.backendservice.model.db.ArticleEntity;
import de.herhackathon.backendservice.model.db.RequestEntity;
import de.herhackathon.backendservice.model.request.ShoppingListRequestDto;
import de.herhackathon.backendservice.repository.RequestRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class RequestService {

    private RequestRepository requestRepository;
    private ArticleService articleService;

    public RequestEntity createRequest(ShoppingListRequestDto shoppingList) {
        log.info("createRequest for {}", shoppingList.toString());
        List<ArticleEntity> articleEntityList = articleService.getArticlesByIds(shoppingList.getArticleIds());
        return requestRepository.save(RequestEntity.builder()
                .articles(articleEntityList)
                .status(RequestStatus.NEW)
                .requesterId(shoppingList.getRequesterId())
                .deadline(LocalDate.now().plusDays(2L).format(DateTimeFormatter.ISO_DATE))
                .build());
    }
}
