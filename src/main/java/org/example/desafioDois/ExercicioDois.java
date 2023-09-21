package org.example.desafioDois;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO INTEIRO: ");
        long number = scan.nextInt();

        String formatteddate = convNumber(number);
        showDate(formatteddate);


    }

    public static String convNumber(long numberCheck) {
        Date data = new Date(numberCheck * 1000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(data);
    }

    public static void showDate(String formDate) {
        System.out.println(formDate);
    }
}


