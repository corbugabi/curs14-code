package ro.fasttrackit.curs14.maven;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Usual java");
        String ascii= FigletFont.convertOneLine("Hello Maven");
        System.out.println(ascii);
    }
}
