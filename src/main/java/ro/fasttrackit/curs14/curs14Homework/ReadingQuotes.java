package ro.fasttrackit.curs14.curs14Homework;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingQuotes {

    public static void readQuotes() throws Exception{
        BufferedReader fileReader = new BufferedReader(new FileReader("target/quotes.txt"));
        String line;
        while ((line = fileReader.readLine()) != null){
            System.out.println(line);
        }
    }
}
