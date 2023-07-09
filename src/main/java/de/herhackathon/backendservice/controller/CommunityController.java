package de.herhackathon.backendservice.controller;

import de.herhackathon.backendservice.model.db.CommunityEntity;
import de.herhackathon.backendservice.model.request.CommunityRequestDto;
import de.herhackathon.backendservice.service.CommunityService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController(value = "Community Controller")
@RequestMapping("/api/rest/v1/communities")
public class CommunityController {

    private CommunityService communityService;

    @PutMapping("/")
    public ResponseEntity<Void> updateCommunity(@RequestBody CommunityRequestDto communityRequest) {
        CommunityEntity communityEntity = communityService.updateCommunity(communityRequest);
        log.info("User with id {} added to community with id {}.", communityRequest.getUserId(), communityEntity.getId());
        return ResponseEntity.ok().build();
    }
}
