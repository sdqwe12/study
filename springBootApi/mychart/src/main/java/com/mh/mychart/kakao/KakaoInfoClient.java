package com.mh.mychart.kakao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "kakao", url = "https://kauth.kakao.com/oauth/token")
public interface KakaoTokenClient {

    @PostMapping(value = "",consumes = "apllication/json")

    KaKaoTokentDto.Response getKakaoToken(
            @RequestHeader("Content-type") String contentType,
            @SpringQueryMap KaKaoTokentDto.Request kaKaoTokenDtoRequest);
}
