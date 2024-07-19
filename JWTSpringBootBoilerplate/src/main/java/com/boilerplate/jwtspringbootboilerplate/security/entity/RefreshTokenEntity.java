package com.boilerplate.jwtspringbootboilerplate.security.entity;


import com.boilerplate.jwtspringbootboilerplate.entity.UserEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.relational.core.mapping.Table;


@Entity
@Data
@Table(name = "refresh_tokens")
public class RefreshTokenEntity {

    @Id
    private Long userId;

    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @MapsId
    @JoinColumn(name = "userId")
    private UserEntity user;

    private String lastAccessToken;

    private String refreshToken;
}
