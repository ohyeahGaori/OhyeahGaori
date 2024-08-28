package com.example.HyegyeongGaori.global.oauth.domain;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")

public class User {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_TB")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @Column
    private String picture;

    @Builder
    public User(String name, String email, String picture) {
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    public User update(String name, String picture) {
        this.name = name;
        this.picture = picture;

        return this;
    }

}
