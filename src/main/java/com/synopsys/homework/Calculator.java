package com.synopsys.homework;

import com.synopsys.homework.compiler.Compiler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;

public class Calculator {
    static final Logger log = LogManager.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: <expression> (<logLevel>)");
            System.exit(1);
        }

        String expression = args[0];
        if (args.length > 1) {
            setLogLevel(args[1]);
        }

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

    private static void setLogLevel(String strLevel) {
        Level level = Level.getLevel(strLevel.toUpperCase());
        if (level == null) {
            return;
        }
        log.info("Setting log level to: " + level.name());

        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();
        LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
        loggerConfig.setLevel(level);
        ctx.updateLoggers();
    }
}
