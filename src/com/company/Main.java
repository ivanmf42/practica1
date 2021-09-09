package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


/*
*Instituto Politécnico Nacional
* Escuela Superior de Cómputo
* Análisis de Algoritmos
* Autor: Iván Martínez Fuentes
* Profesor: Benjamín Luna Benoso
 */

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("N");
        csvWriter.append(",");
        csvWriter.append("T(n)");
        csvWriter.append("\n");

        int j;
        for(j=1; j<20; j++){
            int i, aleatorio, cont=0;
            int n= j*2;
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
            long decimal=0;
            cont++;
            double auxiliar = 0.5;
            cont++;
            for(i=n-1;i>1;i--){
                cont++;
                C[i]=0;
                cont++;
                //C[i]= A[i] & B[i];
                cont++;
                if(A[i] ==1 && B[i]==1){
                    C[i] =1;
                    cont++;
                }
                auxiliar = auxiliar * 2;
                cont++;
                decimal += C[i] *  auxiliar;
                cont++;
                //decimal += (C[i] * (int) Math.pow(2,exponente));
            }
            cont++;
            System.out.println("Decimal es " + decimal);
            cont++;
            csvWriter.append(String.valueOf(n));
            csvWriter.append(",");
            csvWriter.append(String.valueOf(cont));
            csvWriter.append("\n");

            csvWriter.flush();
        }
        csvWriter.close();

    }
}
