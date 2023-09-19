package org.example.desafioUm.ExCinco;

import java.util.ArrayList;
import java.util.Collections;

public class ExercicioCinco {

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(56);
        numbersList.add(21);
        numbersList.add(44);
        numbersList.add(97);
        checkList(numbersList);

    }

    public static void checkList(ArrayList<Integer> numbersList) {
        numbersList.sort(Collections.reverseOrder());
        for (int i : numbersList) {
            System.out.println(i);
        }
    }
}
