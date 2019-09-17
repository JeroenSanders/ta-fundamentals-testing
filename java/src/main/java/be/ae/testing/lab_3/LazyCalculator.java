package be.ae.testing.lab_3;

import java.time.LocalDateTime;

public class LazyCalculator {

    public int forceCalculate(String operator, int a, int b) {
        System.out.println("I was forced to calculate " + a + " " + operator + " " + b);
        return this.doCalculation(operator, a, b);
    }

    public int nicelyCalculate(String operator, int a, int b) {
        if (!isItWorkingTime()) {
            throw new IllegalStateException("I don't want to work right now!");
        }
        return doCalculation(operator, a, b);
    }

    private int doCalculation(String operator, int a, int b) {
        switch(operator) {
            case "+":
                return (a + b) % 7;
            case "*":
                if (a == 0) return 0;
                return b + this.doCalculation("*", a - 1, b);
            default:
                return 42;
        }
    }

    private boolean isItWorkingTime() {
        int hours = LocalDateTime.now().getHour();
        return hours >= 10 && hours <= 12;
    }
}
