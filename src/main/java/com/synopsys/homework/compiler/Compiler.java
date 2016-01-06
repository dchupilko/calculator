package com.synopsys.homework.compiler;

import com.synopsys.homework.parser.CalcGrammarLexer;
import com.synopsys.homework.parser.CalcGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Compiler {
    static final Logger log = LogManager.getLogger(Compiler.class.getName());

    public Integer compile(String inputString) {
        log.debug("Compiling expression \"" + inputString + "\"");

        ANTLRInputStream input = new ANTLRInputStream(inputString);
        CalcGrammarLexer lexer = new CalcGrammarLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        CalcGrammarParser parser = new CalcGrammarParser(tokens);

        parser.setErrorHandler(new ExceptionThrowingErrorHandler());

        int result = parser.eval().value;
        log.debug("Result: " + result);

        return result;
    }
}
