package com.company.project.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.company.project.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    private List<Quote> quotes = new ArrayList<Quote>();
    private Random random = new Random();
    private static int idCounter = 1;

    public QuoteController() {
        quotes.add(new Quote(idCounter++, "Winston Churchill", "Success is not final, failure is not fatal: it is the courage to continue that counts."));
        quotes.add(new Quote(idCounter++, "Theodore Roosevelt", "Believe you can and you're halfway there."));
        quotes.add(new Quote(idCounter++, "H. Jackson Brown Jr.", "The best preparation for tomorrow is doing your best today."));
        quotes.add(new Quote(idCounter++, "Steve Jobs", "The only way to do great work is to love what you do."));
        quotes.add(new Quote(idCounter++, "Jim Rohn", "Successful people do what unsuccessful people are not willing to do."));
        quotes.add(new Quote(idCounter++, "Albert Einstein", "Life is like riding a bicycle. To keep your balance, you must keep moving."));
        quotes.add(new Quote(idCounter++, "Steve Jobs", "Your time is limited, don't waste it living someone else's life."));
        quotes.add(new Quote(idCounter++, "Unknown", "Stay positive, work hard, make it happen."));
        quotes.add(new Quote(idCounter++, "Albert Schweitzer", "Success is not how high you have climbed, but how you make a positive difference to the world."));
        quotes.add(new Quote(idCounter++, "Frank Tyger", "The only limit to our realization of tomorrow will be our doubts of today."));
        quotes.add(new Quote(idCounter++, "Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall."));
        quotes.add(new Quote(idCounter++, "Sam Levenson", "Don't watch the clock; do what it does. Keep going."));
        quotes.add(new Quote(idCounter++, "Steve Jobs", "The only way to do great work is to love what you do. If you haven't found it yet, keep looking."));
        quotes.add(new Quote(idCounter++, "Albert Schweitzer", "Success is not the key to happiness. Happiness is the key to success."));
        quotes.add(new Quote(idCounter++, "C.S. Lewis", "Hardships often prepare ordinary people for an extraordinary destiny."));
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public String getQuote() {
        int index = random.nextInt(quotes.size());
        return "'" + quotes.get(index).getQuote() + "'  -" + quotes.get(index).getAuthor();
    }
}

