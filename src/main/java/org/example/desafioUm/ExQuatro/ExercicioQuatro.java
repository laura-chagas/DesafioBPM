package org.example.desafioUm.ExQuatro;

public class ExercicioQuatro {
    public static void main(String[] args) {

        System.out.println(checkScore(7));
    }

    public static String checkScore(int score) {
        if (score >= 8) {
            return "Aprovado! ";
        } else if (score >= 6) {
            return "Em Recuperação! ";
        } else {
            return "Reprovado! ";
        }
    }

}
