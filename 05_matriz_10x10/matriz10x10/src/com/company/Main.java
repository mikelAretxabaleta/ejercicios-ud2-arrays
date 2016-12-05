package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz=new int [10][10];

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++) {
                Random r=new Random();
                matriz[i][j]= r.nextInt(100);
            }}

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }





    }

}