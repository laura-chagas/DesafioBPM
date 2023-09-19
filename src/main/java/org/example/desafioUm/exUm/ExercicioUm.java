package org.example.desafioUm.exUm;

public class ExercicioUm {

    public static void main(String[] args) {

        checkNumber(21, 12);

    }

    public static void checkNumber(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            System.out.println("O número " + numberOne + " é o maior! ");

        } else if (numberOne == numberTwo) {
            System.out.println("Os números são iguais! ");
        } else {
            System.out.println("O número " + numberTwo + " é o maior! ");
        }

    }


}
