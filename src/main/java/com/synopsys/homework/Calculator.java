package com.synopsys.homework;

import com.synopsys.homework.compiler.Compiler;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {
    static final Logger log = LogManager.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: <expression>");
            System.exit(1);
        }

        String expression = args[0];

        try {
            Compiler compiler = new Compiler();
            int result = compiler.compile(expression);
            System.out.println(result);
        } catch (RuntimeException e) {
            log.error("Error during calculating expression \"" + expression + "\"", e);
            System.err.println("Unable to calculate expression \"" + args[0] + "\". See log for details.");
            System.exit(1);
        }
    }
}
