package org.example.desafioUm.exTres;

public class ExercicioTres {
    public static void main(String[] args) {

        System.out.println(checkLetter("k"));
    }

    public static String checkLetter(String letter) {
        String[] vowelArray = {"A", "E", "I", "O", "U"};

        for (String i : vowelArray) {
            if (i.contains(letter.toUpperCase())) {
                return letter + " é uma vogal! ";
            }
        }
        return letter + " é uma consoante! ";
    }
}
