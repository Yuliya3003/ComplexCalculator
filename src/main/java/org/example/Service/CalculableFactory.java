package org.example.Service;

import org.example.model.ComplexNumber;

public class CalculableFactory implements ICalculableFactory {

    @Override
    public ComplexService create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }

}
