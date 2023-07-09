package de.herhackathon.backendservice.controller;

import de.herhackathon.backendservice.model.request.CreateUserRequestDto;
import de.herhackathon.backendservice.model.respoonse.UserResponseDto;
import de.herhackathon.backendservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController(value = "User Controller")
@RequestMapping("/api/rest/v1/users")
public class UserController {

    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody CreateUserRequestDto createUserRequest) {
        log.info("createUser");
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable int id) {
        log.info("getUser");
        return ResponseEntity.ok(userService.getUserResponse(id));
    }

}
