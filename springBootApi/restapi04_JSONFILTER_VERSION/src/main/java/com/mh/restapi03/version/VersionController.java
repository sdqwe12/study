package com.mh.restapi03.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ap1/v1")
public class VersionController {
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

}
