package org.example.Controller;

import org.example.Service.ConsoleLogger;
import org.example.Service.ICalculableFactory;
import org.example.Service.LogCalculableFactory;
import org.example.View.ViewCalculator;

public class Controller {
        private ICalculableFactory calculableFactory;

        public Controller() {
            this.calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        }

        public void runCalculator() {
            ViewCalculator view = new ViewCalculator(calculableFactory);
            view.run();
        }
    }

