package com.synopsys.homework;

import com.synopsys.homework.compiler.ExceptionThrowingErrorHandler;
import com.synopsys.homework.parser.CalcGrammarLexer;
import com.synopsys.homework.parser.CalcGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CompilerTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"add(1, 2)", 3},
            {"add(1, mult(2, 3))", 7},
            {"mult(add(2, 2), div(9, 3))", 12},
            {"let(a, 5, add(a, a))", 10},
            {"let(a, 5, let(b, mult(a, 10), add(b, a)))", 55},
            {"let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b)))", 40},
        });
    }

    private final String testExpression;
    private final int expectedResult;

    public CompilerTest(String testExpression, int expectedResult) {
        this.testExpression = testExpression;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testRule() {
        ANTLRInputStream input = new ANTLRInputStream(this.testExpression);
        CalcGrammarLexer lexer = new CalcGrammarLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        CalcGrammarParser parser = new CalcGrammarParser(tokens);

        parser.removeErrorListeners();
        parser.setErrorHandler(new ExceptionThrowingErrorHandler());

        int actualResult = parser.eval().value;
        Assert.assertEquals(this.expectedResult, actualResult);
    }
}
