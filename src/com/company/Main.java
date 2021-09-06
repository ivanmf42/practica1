package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("T(n)");
        csvWriter.append(",");
        csvWriter.append("N");
        csvWriter.append("\n");

        int j;
        for(j=0; j<15; j++){
            int i, aleatorio, cont=0;
            int n= j*2;//Integer.parseInt(System.console().readLine());
            //Creamos y llenamos los arreglos de manera aleatoria
            int[] A = new int[n], B = new int [n], C =new int[n];
            for (i=0; i<n; i++){
                if(Math.random()>0.5){
                    aleatorio=1;
                }else {
                    aleatorio=0;
                }
                A[i]= aleatorio;
            }
            for (i=0; i<n; i++){
                if(Math.random()>0.5){
                    aleatorio=1;
                }else {
                    aleatorio=0;
                }
                B[i]= aleatorio;
            }
            //Convertimos el binario a decimal
            int decimal=0, exponente=n-1;
            for(i=0;i<n;i++){
                C[i]= A[i] & B[i];
                decimal += (C[i] * (int) Math.pow(2,exponente));
                exponente--;
            }
            System.out.println("Decimal es " + decimal);

            csvWriter.append(String.valueOf(cont));
            csvWriter.append(",");
            csvWriter.append(String.valueOf(n));
            csvWriter.append("\n");

            csvWriter.flush();
        }
        csvWriter.close();

    }
}
