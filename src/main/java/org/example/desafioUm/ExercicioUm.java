package org.example.desafioUm;

import java.util.ArrayList;
import java.util.Collections;

public class ExercicioUm {
    static ArrayList<Integer> numbersList = new ArrayList<>();
    static ArrayList<Integer> listEvenNumbers = new ArrayList<>();
    static ArrayList<Integer> listOddNumbers = new ArrayList<>();

    public static void main(String[] args) {

        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);

        checkNumbersinList();

    }

    public static void checkNumbersinList() {
        for (int i : numbersList) {
            if (i > 1 && i < 10000) {
                if (i % 2 == 0) {
                    listEvenNumbers.add(i);
                } else {
                    listOddNumbers.add(i);
                }
            } else {
                System.out.println("Não aceitamos números negativos, tente novamente! ");
                return;
            }
        }
        showNumbers();
    }

    public static void showNumbers() {
        System.out.println("NÚMEROS PARES: ");
        Collections.sort(listEvenNumbers);
        for (int i : listEvenNumbers) {
            System.out.println("[ " + i + " ] ");
        }

        System.out.println("--------------------------");
        listOddNumbers.sort(Collections.reverseOrder());
        System.out.println("NÚMEROS ÍMPARES: ");
        for (int i : listOddNumbers) {
            System.out.println("[ " + i + " ] ");
        }
    }
}
