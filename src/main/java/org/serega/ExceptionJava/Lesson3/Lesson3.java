package org.serega.ExceptionJava.Lesson3;

import java.util.logging.Logger;

public class Lesson3 {
    double number1;
    double number2;
    private Double DivisionResult = null;
    private Double result = null;
    private String errorMessage = null;

    public Lesson3(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void comply() {
        if (number2 == 0) {
            errorMessage = "Деление на ноль!";
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        result = number1 / number2;
    }

    public String getDivisionResult() {
        if (errorMessage != null) {
            return String.format("Деление %.1f / %.1f завершилось ошибкой: %s", number1, number2, errorMessage);
        }else {
            return String.format("Деление %.1f / %.1f = %.2f", number1, number2, result);
        }
    }
}
