package com.mh.restapi01.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
public class MainController {

//    @Autowired 스프링부트에선 오토와이어보다 프라이빗 파이널 쓰는걸 권장한다고함
    private final MainService mainService;

    @GetMapping("main")
    public String main(){
        System.out.println(mainService);
        return "main";
    }
    @GetMapping("mainapi")
    public @ResponseBody String mainapi(){
        return "mainapi";
    }
}
