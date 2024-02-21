package org.example.Service;

import org.example.model.ComplexNumber;

public interface ComplexService {
    ComplexService sum(ComplexNumber b);
    ComplexService multiply(ComplexNumber b);
    ComplexService division(ComplexNumber b) throws ArithmeticException;

    ComplexNumber getResult();
}
