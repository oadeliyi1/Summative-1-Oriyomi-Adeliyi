package com.company.project.controller;
import com.company.project.models.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    private List<Word> words = new ArrayList<>();
    private Random random = new Random();
    private static int idCounter = 1;

    public WordController() {
        words.add(new Word(idCounter++, "Gargantuan", "Extremely large; huge."));
        words.add(new Word(idCounter++, "Serendipity", "The occurrence and development of events by chance in a happy or beneficial way."));
        words.add(new Word(idCounter++, "Luminous", "Giving off light; shining."));
        words.add(new Word(idCounter++, "Ebullient", "Joyfully unrestrained; enthusiastic."));
        words.add(new Word(idCounter++, "Ethereal", "Very light, delicate, and airy; otherworldly."));
        words.add(new Word(idCounter++, "Luminance", "The amount of light that a surface emits or reflects."));
        words.add(new Word(idCounter++, "Exquisite", "Extremely delicate and intricate; very beautiful."));
        words.add(new Word(idCounter++, "Enigmatic", "Mysterious and difficult to understand."));
        words.add(new Word(idCounter++, "Effervescent", "Bubbling with excitement; vivacious."));
        words.add(new Word(idCounter++, "Luminescence", "The emission of light by a substance not resulting from heat."));
        words.add(new Word(idCounter++, "Ebullience", "The quality of being full of excitement and energy."));
        words.add(new Word(idCounter++, "Luminosity", "The quality of being bright and shining."));
        words.add(new Word(idCounter++, "Serene", "Calm and peaceful."));
        words.add(new Word(idCounter++, "Etherealness", "The quality of being light and delicate."));
        words.add(new Word(idCounter++, "Luminiferous", "Carrying or emitting light."));
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getWord() {
        int index = random.nextInt(words.size());
        return words.get(index).getWord() + ": " + words.get(index).getDefinition();
    }
}

