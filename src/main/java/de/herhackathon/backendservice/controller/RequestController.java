package de.herhackathon.backendservice.controller;

import de.herhackathon.backendservice.model.db.RequestEntity;
import de.herhackathon.backendservice.model.request.ShoppingListRequestDto;
import de.herhackathon.backendservice.service.RequestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController(value = "Shopping request Controller")
@RequestMapping("/api/rest/v1/requests")
public class RequestController {

    RequestService requestService;

    @PostMapping("/")
    public ResponseEntity<RequestEntity> createRequest(@RequestBody ShoppingListRequestDto shoppingListRequestDto) {
        log.info("createRequest");
        return ResponseEntity.ok(requestService.createRequest(shoppingListRequestDto));
    }
}
