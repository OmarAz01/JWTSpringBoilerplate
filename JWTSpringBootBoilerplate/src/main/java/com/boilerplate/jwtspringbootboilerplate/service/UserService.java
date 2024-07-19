package com.boilerplate.jwtspringbootboilerplate.service;

import com.boilerplate.jwtspringbootboilerplate.dto.UserDTO;
import com.boilerplate.jwtspringbootboilerplate.entity.UserEntity;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<UserDTO> findUser(Long id);

    ResponseEntity<Long> deleteUser(Long id);


    ResponseEntity<UserDTO> findByUsername(String username);

    ResponseEntity<UserEntity> findByEmail(String email);

    ResponseEntity<UserDTO> save(UserEntity user);


}
