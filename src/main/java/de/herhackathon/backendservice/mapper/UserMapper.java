package de.herhackathon.backendservice.mapper;

import de.herhackathon.backendservice.model.db.CommunityEntity;
import de.herhackathon.backendservice.model.db.UserEntity;
import de.herhackathon.backendservice.model.request.CreateUserRequest;
import de.herhackathon.backendservice.model.respoonse.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity asUserEntity(CreateUserRequest createUserRequest);

    @Mapping(target = "communities", expression = "java(mapCommunities(userEntity.getCommunities()))")
    UserResponse asUserResponse(UserEntity userEntity);

    default List<String> mapCommunities(List<CommunityEntity> communityEntities) {
        return communityEntities.stream().map(c -> c.getType().toString()).toList();
    }
}
