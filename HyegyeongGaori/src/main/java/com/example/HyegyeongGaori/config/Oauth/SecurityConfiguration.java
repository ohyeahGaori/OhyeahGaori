package com.example.HyegyeongGaori.config.Oauth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.example.HyegyeongGaori.global.oauth.application.OauthService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

//     @Bean
//     SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .csrf(
//                         (csrfConfig) -> csrfConfig.disable()
//                 )
//                 .headers(
//                         (headerConfig) -> headerConfig.frameOptions(
//                                 frameOptionsConfig -> frameOptionsConfig.disable()
//                         )
//                 )
//                 .authorizeHttpRequests((authorizeRequest) -> authorizeRequest
//                         .requestMatchers("/","/error/**").permitAll()
//                         .anyRequest().authenticated()
//                 )
//                 // .logout( // 로그아웃 성공 시 / 주소로 이동
//                 //         (logoutConfig) -> logoutConfig.logoutSuccessUrl("/")
//                 // )
//                 //OAuth2 로그인 기능에 대한 여러 설정
//                 .oauth2Login(oauth2Login ->
//                         oauth2Login
//                                 // .defaultSuccessUrl("/oauth/google-callback", true)  // 로그인 성공 후 리디렉션 경로 설정
//                                 // .failureUrl("/login?error=true")
//                                 // .authorizationEndpoint(authorizationEndpointConfig ->
//                                 //         authorizationEndpointConfig
//                                 //                 .baseUri("/oauth2/authorize") // (1)       
//                                 // )
//                                 // .redirectionEndpoint(redirectionEndpointConfig ->
//                                 //                         redirectionEndpointConfig
//                                 //                         .baseUri("/oauth"))
//                                 .defaultSuccessUrl("/login/oauth2/code/google", true)); //이게 사용자에게 보여지는 화면, 즉 redirect_uri랑 달라야함!! (2)
                
//         return http.build();
//     }

        // private final OauthService oauthService;

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http
                        .authorizeHttpRequests(authorize -> authorize
                                .anyRequest().authenticated()
                        )
                        .oauth2Login(withDefaults());
                                // .userInfoEndpoint()
                                //         .userService(oauthService);
                return http.build();
        }

    
}
