package com.example.HyoGaori.global.oauth.domain.dto;

import com.example.HyoGaori.global.oauth.domain.entity.UserRole;
import com.example.HyoGaori.global.oauth.domain.entity.User;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class JoinDto {

    @NotBlank(message = "로그인 아이디를 입력해 주세요")
    private String loginId;

    @NotBlank(message = "비밀번호를 입력해 주세요")
    private String password;
    private String passwordCheck;

    @NotBlank(message = "닉네임을 입력해 주세요")
    private String nickname;

    // 비밀번호 암호화 X
    public User toEntity() {
        return User.builder()
                .loginId(this.loginId)
                .password(this.password)
                .nickname(this.nickname)
                .role(UserRole.USER)
                .build();
    }

    // 비밀번호 암호화
    public User toEntity(String encodedPassword) {
        return User.builder()
                .loginId(this.loginId)
                .password(encodedPassword)
                .nickname(this.nickname)
                .role(UserRole.USER)
                .build();
    }
}
