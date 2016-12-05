package com.company;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[][] nombre = new String[2][10];
        for (int i=0; i<3;i++) {
            System.out.print("Introduce nombre: ");

            nombre[0][i] = br.readLine();

            System.out.print("Introduce apellido: ");

            nombre[1][i] = br.readLine();

        }

        System.out.print  ("Introduce letra: ");
        String letra=br.readLine().toUpperCase();

        for (int i=0; i<3;i++){
            if (nombre[0][i].toUpperCase().startsWith(letra)){
                System.out.println(nombre[0][i]);
        }}

    }

}
