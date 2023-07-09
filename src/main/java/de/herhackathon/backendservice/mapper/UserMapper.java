package de.herhackathon.backendservice.mapper;

import de.herhackathon.backendservice.model.db.CommunityEntity;
import de.herhackathon.backendservice.model.db.UserEntity;
import de.herhackathon.backendservice.model.request.CreateUserRequestDto;
import de.herhackathon.backendservice.model.respoonse.UserResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity asUserEntity(CreateUserRequestDto createUserRequest);

    @Mapping(target = "communities", expression = "java(mapCommunities(userEntity.getCommunities()))")
    UserResponseDto asUserResponse(UserEntity userEntity);

    default List<String> mapCommunities(List<CommunityEntity> communityEntities) {
        return communityEntities.stream().map(c -> c.getType().toString()).toList();
    }
}
