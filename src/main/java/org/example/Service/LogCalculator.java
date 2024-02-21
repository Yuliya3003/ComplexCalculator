package org.example.Service;

import org.example.model.ComplexNumber;

public class LogCalculator implements ComplexService {
        ComplexCalculator complexCalculator;
        Logable logger;

    public LogCalculator(ComplexCalculator complexCalculator, Logable logger) {
        this.complexCalculator = complexCalculator;
        this.logger = logger;
    }


    @Override
    public ComplexService sum(ComplexNumber b) {
        logger.log("Вызов метода суммы с аргументом: "+ b);
        return complexCalculator.sum(b);
    }

    @Override
    public ComplexService multiply(ComplexNumber b) {
        logger.log("Вызов метода умножения с аргументом: "+ b);
        return complexCalculator.multiply(b);
    }

    @Override
    public ComplexService division(ComplexNumber b) throws ArithmeticException {
        logger.log("Вызов метода деления с аргументом: "+ b);
        return complexCalculator.division(b);
    }

    @Override
    public ComplexNumber getResult() {
        logger.log("Результат");
        return complexCalculator.getResult();
    }
}
