package de.herhackathon.backendservice.service;

import de.herhackathon.backendservice.mapper.UserMapper;
import de.herhackathon.backendservice.model.db.UserEntity;
import de.herhackathon.backendservice.model.request.CreateUserRequest;
import de.herhackathon.backendservice.model.respoonse.UserResponse;
import de.herhackathon.backendservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserResponse createUser(CreateUserRequest createUserRequest) {
        UserEntity userEntity = userRepository.save(userMapper.asUserEntity(createUserRequest));
        log.info(userEntity.toString());
        return userMapper.asUserResponse(userEntity);
    }
}
