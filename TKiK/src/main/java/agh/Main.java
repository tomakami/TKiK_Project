package agh;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        String filename = "src/main/java/agh/input.cpp";
        try {
            CharStream inputStream = CharStreams.fromFileName(filename);
            TKiKLexer lexer = new TKiKLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            TKiKParser parser = new TKiKParser(commonTokenStream);

            TKiKParser.Entire_programContext entireProgramContext = parser.entire_program();

            TKiK_Final_Visitor visitor = new TKiK_Final_Visitor(new PrintStream("output.py"));

            visitor.visit(entireProgramContext);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
