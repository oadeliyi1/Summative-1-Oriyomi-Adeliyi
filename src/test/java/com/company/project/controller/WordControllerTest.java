package com.company.project.controller;


//import org.junit.*;

import com.company.project.controller.WordController;
import com.company.project.models.Word;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(WordController.class)
public class WordControllerTest {


    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<Word> words = new ArrayList<>();

    @Before
    public void setUp() {
        // Standard set up method, for instantiating test objects
        // Don't have to do anything special for mockMvc since it's Autowired
    }
    @Test
    public void shouldReturnWord() throws Exception {

           String outputJson = mapper.writeValueAsString(words);

        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());


    }

}
