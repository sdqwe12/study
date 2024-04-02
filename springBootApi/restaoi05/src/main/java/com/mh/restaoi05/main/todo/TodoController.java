package com.mh.restaoi05.main.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class TodoController {

    @RequestMapping("/todo")
    public String todo(){
        return "todo/todo";
    }
}
