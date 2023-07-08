package de.herhackathon.backendservice.controller;

import de.herhackathon.backendservice.model.request.CreateUserRequest;
import de.herhackathon.backendservice.model.respoonse.UserResponse;
import de.herhackathon.backendservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController(value = "User Controller")
@RequestMapping("/api/rest/v1/users")
public class UserController {

    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<UserResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        log.info("createUser");
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }

}
