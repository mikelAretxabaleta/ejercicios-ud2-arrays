package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;

            }
        }

        visualizarTablero(matriz);

        boolean fin = false;
        int jugadas=0;

        do {

            System.out.println();
            System.out.print("Jugador 1. Elige fila (0-2): ");
            int fila = Integer.parseInt(br.readLine());
            jugadas++;
            System.out.print("Jugador 1. Elige columna (0-2): ");
            int columna = Integer.parseInt(br.readLine());


            matriz[fila][columna]=1;

            visualizarTablero(matriz);


            System.out.print("Jugador 2. Elige fila: ");
            int fila2 = Integer.parseInt(br.readLine());

            System.out.print("Jugador 2. Elige columna: ");
            int columna2 = Integer.parseInt(br.readLine());
            jugadas++;
            matriz[fila2][columna2]=2;


            visualizarTablero(matriz);
            if(jugadas>=9){
                fin=true;
                System.out.println("Ha habido empate");
            }

            if (matriz[0][0]==1 && matriz[0][1]==1 && matriz[0][2]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[1][0]==1 && matriz[1][1]==1 && matriz[1][2]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[2][0]==1 && matriz[2][1]==1 && matriz[2][2]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[0][0]==1 && matriz[1][0]==1 && matriz[2][0]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[0][1]==1 && matriz[1][1]==1 && matriz[2][1]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[0][2]==1 && matriz[1][2]==1 && matriz[2][2]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[0][0]==1 && matriz[1][1]==1 && matriz[2][2]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[0][2]==1 && matriz[1][1]==1 && matriz[2][0]==1)
            {fin=true;
                System.out.println("El ganador es el jugador 1");}
            if (matriz[0][0]==2 && matriz[0][1]==2 && matriz[0][2]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}
            if (matriz[1][0]==2 && matriz[1][1]==2 && matriz[1][2]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}
            if (matriz[2][0]==2 && matriz[2][1]==2 && matriz[2][2]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}
            if (matriz[0][0]==2 && matriz[1][0]==2 && matriz[2][0]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}
            if (matriz[0][1]==2 && matriz[1][1]==2 && matriz[2][1]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}
            if (matriz[0][2]==2 && matriz[1][2]==2 && matriz[2][2]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}
            if (matriz[0][0]==2 && matriz[1][1]==2 && matriz[2][2]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}
            if (matriz[0][2]==2 && matriz[1][1]==2 && matriz[2][0]==2)
            {fin=true;
                System.out.println("El ganador es el jugador 2");}

        } while (!fin);











    }


    public static void visualizarTablero(int[][] matriz) {
        int cero=0;
        int uno=1;
        int dos=2;
        System.out.println("Jugador 1 = X");
        System.out.println("Jugador 2 = O");
        System.out.println();
        System.out.println("   Columnas");
        System.out.format("%4d%4d%4d",cero,uno,dos);
        System.out.println();
        System.out.print("----------------");
        System.out.println();
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                switch (matriz[i][j]){
                    case 0:
                        System.out.print("  .  ");
                        break;
                    case 1:
                        System.out.print("  X  ");
                        break;
                    case 2:
                        System.out.print("  O  ");
                        break;

                }



            }
            System.out.println();

        }

    }

}