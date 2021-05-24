package ro.fasttrackit.curs14.curs14Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{
        readOneLine();
    //    readFullFile();
    //    readFileBuffered();
    }

    private static void readFileBuffered()throws Exception{
        System.out.println("======Buffered reader");
        BufferedReader fileReader = new BufferedReader(new FileReader("files/quotes.txt"));
        String line;
        while ((line = fileReader.readLine()) != null){
            System.out.println(line);
        }
    }

    private static void readFullFile()throws Exception{
        System.out.println("=============ReadAll");
        Scanner fileScanner = new Scanner(new File("files/test.txt"));
        while(fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
    }

    private static void readOneLine()throws Exception{
        Scanner fileScanner = new Scanner(new File("files/quotes.txt"));
        String line = fileScanner.nextLine();
        System.out.println(line);

    }
}