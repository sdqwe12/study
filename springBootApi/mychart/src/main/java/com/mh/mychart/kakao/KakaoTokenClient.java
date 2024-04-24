package com.mh.mychart.kakao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "kakao", url = "https://kauth.kakao.com/oauth/token")
public interface kakaoTokenController {

    @PostMapping(value = "",consumes = "apllication/json")
    String getKakaoToken(
            @RequestHeader("Content-type") String contentType,
            KaKaoTokenRequestDto kaKaoTokenRequestDto);
}
