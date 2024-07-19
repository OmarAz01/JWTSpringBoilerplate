package com.boilerplate.jwtspringbootboilerplate.dto;

import com.boilerplate.jwtspringbootboilerplate.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long userId;
    private String email;
    private String username;
    private String role;

    public static UserDTO convertToDTO(UserEntity user) {
        return new UserDTO(
                user.getUserId(),
                user.getEmail(),
                user.getUsername(),
                user.getRole().toString()
        );
    }
}

