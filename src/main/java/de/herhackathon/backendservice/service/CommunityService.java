package de.herhackathon.backendservice.service;

import de.herhackathon.backendservice.model.db.CommunityEntity;
import de.herhackathon.backendservice.model.request.CommunityRequestDto;
import de.herhackathon.backendservice.repository.CommunityRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class CommunityService {

    private CommunityRepository communityRepository;
    private UserService userService;

    public CommunityEntity updateCommunity(CommunityRequestDto communityRequest) {
        List<CommunityEntity> communityEntityList = communityRepository.findAll().stream()
                .filter(communityEntity -> {
                    if (!communityEntity.getUsers().isEmpty()) {
                        return (communityEntity.getUsers().stream().anyMatch(user -> user.getId() == communityRequest.getUserId())
                        && communityEntity.getType().equals(communityRequest.getType()));
                    }
                    return false;
                }).toList();
        if (communityEntityList.size() > 1) {
            log.error("Invalid data. {} matching communities found.", communityEntityList.size());
            return null;
        } else if (communityEntityList.size() == 1) {
            return communityEntityList.get(0);
        } else {
            return communityRepository.save(CommunityEntity.builder()
                    .type(communityRequest.getType())
                    .users(Collections.singletonList(userService.getUser(communityRequest.getUserId())))
                    .build());
        }
    }
}
