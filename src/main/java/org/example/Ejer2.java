package org.example;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {

        double [] elvector = new double[5];



        do {

            try {
                fillArray(elvector);
            }catch (Exception e){
                System.err.println("error");
            }


            for (int i = 0; i < elvector.length; i++) {
                System.out.println(elvector[i]);
            }        }while ( isFull(elvector));
    }

    public static boolean isFull(double [] elVector){
        int cont = 0;
        for (int i = 0; i <elVector.length; i++) {
            if (elVector[i]!= 0.0)
                cont++;
        }
        if (cont == 5 )
            return false;
        return true;
    }

    public static  void fillArray(double [] arr){
        Scanner sc = new  Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
    }
}
