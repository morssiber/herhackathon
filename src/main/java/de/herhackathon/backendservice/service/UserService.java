package de.herhackathon.backendservice.service;

import de.herhackathon.backendservice.mapper.UserMapper;
import de.herhackathon.backendservice.model.db.UserEntity;
import de.herhackathon.backendservice.model.request.CreateUserRequestDto;
import de.herhackathon.backendservice.model.respoonse.UserResponseDto;
import de.herhackathon.backendservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserResponseDto createUser(CreateUserRequestDto createUserRequest) {
        UserEntity userEntity = userRepository.saveAndFlush(userMapper.asUserEntity(createUserRequest));
        log.info(userEntity.getEmail());
        return userMapper.asUserResponse(userEntity);
    }

    public UserResponseDto getUserResponse(int id) {
        return userMapper.asUserResponse(getUser(id));
    }

    public UserEntity getUser(int id) {
        log.info("getUser for id {}", id);
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
        if (optionalUserEntity.isEmpty()) {
            log.info("No user with id {} found", id);
            return null;
        }
        log.info("User with email {} found", optionalUserEntity.get().getEmail());
        return optionalUserEntity.get();
    }

}
