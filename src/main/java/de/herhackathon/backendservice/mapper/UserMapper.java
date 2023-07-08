package de.herhackathon.backendservice.mapper;

import de.herhackathon.backendservice.model.db.UserEntity;
import de.herhackathon.backendservice.model.request.CreateUserRequest;
import de.herhackathon.backendservice.model.respoonse.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity asUserEntity(CreateUserRequest createUserRequest);
    UserResponse asUserResponse(UserEntity userEntity);
}
