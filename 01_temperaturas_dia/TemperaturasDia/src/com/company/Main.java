package com.company;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] temp;
        temp = new double[24];
        double total=0, max=Double.MIN_VALUE, min=Double.MAX_VALUE;
        int i=0;

        for (i=0; i<24;i++) {

            System.out.println("Introduce temperatura: ");

            temp[i] = Double.parseDouble(br.readLine());


            if (temp[i] > max) {
                max = temp[i];
            }
            if (temp[i] < min) {
                min = temp[i];
            }

            total += temp[i];

            System.out.print(i);
            System.out.print("  ");
        }

        for(i=0; i<24;i++) {

            for (int j = 0; j < temp[i]; j++) {
                System.out.print("*");
            }

            System.out.print("  ");
            System.out.print(temp[i]);


            if (temp[i] == max) {
                System.out.print("-->MAX");

            }
            if (temp[i] == min) {
                System.out.print("-->MIN");
            }
            System.out.println();
        }
        double media=total/24;

        System.out.println("Temperatura máxima: "+max);
        System.out.println("Temperatura mínima: "+min);
        System.out.println("Temperatura media: "+media);

    }
}
