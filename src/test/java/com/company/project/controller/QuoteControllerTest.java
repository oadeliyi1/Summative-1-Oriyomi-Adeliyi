package com.company.project.controller;

//import org.junit.*;

import com.company.project.controller.QuoteController;
import com.company.project.models.Quote;
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

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.either;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class QuoteControllerTest {


    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<Quote> quotes = new ArrayList<Quote>();

    @Before
    public void setUp() {
        // Standard set up method, for instantiating test objects
        // Don't have to do anything special for mockMvc since it's Autowired
    }
    @Test
    public void shouldReturnQuote() throws Exception {

     //   String outputJson = mapper.writeValueAsString(quotes);

        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());


    }

}
