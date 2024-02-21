package org.example.View;

import org.example.Service.ComplexService;
import org.example.Service.ICalculableFactory;
import org.example.model.ComplexNumber;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptInt("Введите первый аргумент: ");
            ComplexService calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptInt("Введите второй аргумент: ");
                    calculator.multiply(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptInt("Введите второй аргумент: ");
                    calculator.division(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат "+ result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Введите действительную часть числа: ");
        double realPart1 = scanner.nextDouble();
        System.out.print("Введите мнимую часть числа: ");
        double imaginaryPart1 = scanner.nextDouble();
        ComplexNumber primaryArg = new ComplexNumber(realPart1, imaginaryPart1);
        return primaryArg;
    }
}
