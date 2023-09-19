package org.example.desafioDois;

public class DesafioDois {
    public static void main(String[] args) {
        int n = 6;
        if (checkNumber(n)) {
            returnFactorial(n);
        } else {
            System.err.println(returnError());
        }
    }

    public static boolean checkNumber(int number) {
        return number > 0 && number < 13;
    }

    public static void returnFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static String returnError() {
        return "O número inserido é inválido, tente novamente, mas seguindo as condições: N(0 < N < 13)";
    }
}
