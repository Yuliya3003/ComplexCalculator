package org.example.Service;

import org.example.model.ComplexNumber;

public class ComplexCalculator implements ComplexService{
    private ComplexNumber primaryArg;

    public ComplexCalculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public ComplexService sum(ComplexNumber b) {
        double realPart = primaryArg.getReal() + b.getReal();
        double imaginaryPart = primaryArg.getImaginary() + b.getImaginary();
        primaryArg = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    @Override
    public ComplexService multiply(ComplexNumber b) {
        double realPart = primaryArg.getReal() * b.getReal() - primaryArg.getImaginary() * b.getImaginary();
        double imaginaryPart = primaryArg.getReal() * b.getImaginary() + primaryArg.getImaginary() * b.getReal();
        primaryArg = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    @Override
    public ComplexService division(ComplexNumber b) throws ArithmeticException {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double realPart = (primaryArg.getReal() * b.getReal() + primaryArg.getImaginary() * b.getImaginary()) / denominator;
        double imaginaryPart = (primaryArg.getImaginary() * b.getReal() - primaryArg.getReal() * b.getImaginary()) / denominator;
        primaryArg = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }


}
