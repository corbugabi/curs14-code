package ro.fasttrackit.curs14.curs14Homework;

import ro.fasttrackit.curs14.homework.DaySchedule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuoteService {
    private final List<Quotes> quotes = new ArrayList<>();

    public List<String> getAllQuotes() throws Exception {
        List<String> result = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/quotes.txt"), quotes.size());
        String line;
        while ((line = fileReader.readLine()) != null){
            result.add(line);
        }
        return result;
    }
}
