package org.example.Service;

import org.example.model.ComplexNumber;

public interface ICalculableFactory {
    ComplexService create(ComplexNumber primaryArg);
}
