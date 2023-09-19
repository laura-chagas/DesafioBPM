package org.example.desafioTres;

public class DesafioTres {

    public static void main(String[] args) {
        int distance = 25;
        double fuel = 22.00;

        calculate(distance, fuel);

    }

    public static void calculate(int distance, double fuel) {
        double average = distance / fuel;
        System.out.println("Consumo médio: " + String.format("%.3f", average) + " km/l");
    }

}
