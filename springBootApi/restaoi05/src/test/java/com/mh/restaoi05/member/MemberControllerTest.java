package com.mh.restaoi05.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc //목엠브시 사용하고싶을 때 어노테이션
class MemberControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    MemberController memberController;

    @Test
    void member() throws Exception {
       ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/member"));

        resultActions
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("member"));
    }
}