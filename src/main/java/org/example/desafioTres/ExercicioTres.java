package org.example.desafioTres;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = scan.nextInt();

        int fib1 = 0;
        int fib2 = 1;
        int fibonacci = 0;

        for (int i = 0; i < num; i++) {
            fibonacci = fib1 + fib2;
            fib2 = fib1;
            fib1 = fibonacci;
        }

        System.out.println("Fib(" + num + ") = " + fibonacci);

    }
}
