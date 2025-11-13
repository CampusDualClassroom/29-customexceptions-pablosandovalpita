package com.campusdual.classroom;


class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exercise {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("No se puede dividir entre cero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divisionWithCustomException(10, 0));
        } catch (DivisionByZeroException e) {
            System.out.println("Se ha capturado la excepción personalizada: " + e.getMessage());
        }
    }
}
