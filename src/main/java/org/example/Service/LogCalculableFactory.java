package org.example.Service;

import org.example.model.ComplexNumber;

public class LogCalculableFactory implements ICalculableFactory{
    private Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public ComplexService create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logger);
    }
}