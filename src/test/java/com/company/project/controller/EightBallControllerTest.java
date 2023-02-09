package com.company.project.controller;

//import org.junit.*;

import com.company.project.controller.EightBallController;
import com.company.project.models.EightBall;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.either;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@WebMvcTest(EightBallController.class)
public class EightBallControllerTest {


    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();


    private List<EightBall> answers;

    @Before
    public void setUp() {
        // Standard set up method, for instantiating test objects
        // Don't have to do anything special for mockMvc since it's Autowired
    }
    @Test
    public void shoudReturnResonseOnPostRequest() throws Exception {

        String question = "Should I move?";

        //EightBall inputBall = new EightBall();
      //inputBall.se




        mockMvc.perform(post("/magic").content(question).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content()
                        .string(either(containsString("It is decidedly so"))
                                .or(containsString("Yes, definitely"))
                                .or(containsString("As I see it, yes"))
                                .or(containsString("You may rely on it"))
                                .or(containsString("Without a doubt"))
                                .or(containsString("It is certain"))));
                        ;

    }














}
