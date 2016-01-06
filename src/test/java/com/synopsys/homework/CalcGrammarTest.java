package com.synopsys.homework;

import com.synopsys.homework.compiler.ExceptionThrowingErrorHandler;
import com.synopsys.homework.parser.CalcGrammarLexer;
import com.synopsys.homework.parser.CalcGrammarParser;
import org.antlr.v4.runtime.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalcGrammarTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {true, "add(1, 2)"},
            {true, "add(1, mult(2, 3))"},
            {true, "mult(add(2, 2), div(9, 3))"},
            {true, "let(a, 5, add(a, a))"},
            {true, "let(a, 5, let(b, mult(a, 10), add(b, a)))"},
            {true, "let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b)))"},

            {false, "1"},
            {false, "add"},
            {false, "add(1)"},
            {false, "let(a, 1)"},
        });
    }

    private final boolean testValid;
    private final String testString;

    public CalcGrammarTest(boolean testValid, String testString) {
        this.testValid = testValid;
        this.testString = testString;
    }

    @Test
    public void testRule() {
        ANTLRInputStream input = new ANTLRInputStream(this.testString);
        CalcGrammarLexer lexer = new CalcGrammarLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        CalcGrammarParser parser = new CalcGrammarParser(tokens);

        parser.removeErrorListeners();
        parser.setErrorHandler(new ExceptionThrowingErrorHandler());

        if (this.testValid) {
            ParserRuleContext ruleContext = parser.eval();
            Assert.assertNull(ruleContext.exception);
        } else {
            try {
                ParserRuleContext ruleContext = parser.eval();
                Assert.fail("Failed on \"" + this.testString + "\"");
            } catch (RuntimeException e) {
                // do nothing
            }
        }
    }
}
