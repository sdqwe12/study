package com.mh.restapi03.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HeadController {

    @GetMapping(value = "header",headers = "v1=1")
    public String paramV1(){
        return "headers1";
    }
    @GetMapping(value = "header",headers = "v1=2")
    public String paramV2(){
        return "headers2";
    }
}
