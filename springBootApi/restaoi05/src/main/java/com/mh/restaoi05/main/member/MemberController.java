package com.mh.restaoi05.main.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/main")
public class MemberController {

    @GetMapping("/member")
    public String member(Model model){
        List<String> list = Arrays.asList("111","222","333");
        model.addAttribute("stringlist",list);

        return "member/member";
    }
}
