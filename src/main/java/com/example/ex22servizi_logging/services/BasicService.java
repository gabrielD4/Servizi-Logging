package com.example.ex22servizi_logging.services;

import com.example.ex22servizi_logging.NoContentInsertedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    private Logger logger = LoggerFactory.getLogger(BasicService.class);

    public String welcome() {
        String welcome = "welcome";
        logger.info("This is the welcome message");
        return welcome;
    }

    public int getExponent(int n1, int n2) {
        logger.info("Number used in exponent operation are: {}, {}", n1, n2);
        int result = 1;
        for (int i = 1; i <= n2; ++i) {
        result *= n1;
        }
        logger.debug("Result of operation is {}", result);
        return result;
    }

    public void throwException() {
        RuntimeException exception = new NoContentInsertedException("No content");
        logger.warn("This exception is thrown: " + exception);
        throw exception;
    }
}
