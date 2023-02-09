package com.company.project.controller;
import com.company.project.models.EightBall;
import com.company.project.models.Quote;
import com.company.project.models.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EightBallController {

    private List<String> responses = new ArrayList<>();
    private List<EightBall> answers = new ArrayList<>();
    private Random random = new Random();
    private static int idCounter = 1;


    public EightBallController() {

        responses.add("It is decidedly so");
        responses.add("Yes, definitely");
        responses.add("As I see it, yes");
        responses.add("You may rely on it");
        responses.add("Without a doubt");
        responses.add("It is certain");



    }


    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)

    public String createResponse(@RequestBody String question) {
        if(question == null) {
            question = " ";
        }
        int index = random.nextInt(responses.size());
        EightBall res = new EightBall(idCounter++,  responses.get(index),question);
        answers.add(res);
        return res.getAnswer();
    }
}