package com.mh.green2nd.login;

import com.mh.green2nd.jwt.TokenController;
import com.mh.green2nd.jwt.TokenManager;
import com.mh.green2nd.user.UserRepository;
import com.mh.green2nd.user.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {
    private final UserRepository userRepository;
    private final UserService userService;
    private final TokenManager tokenManager;
}

// github 합치고
// url 맵핑
