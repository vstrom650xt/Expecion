package org.example;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        double [] elvector = new double[5];
        int i=0;

        do {
            try {
                elvector[i]=sc.nextInt();
                i++;

            }catch (Exception e){
                System.err.println("hola , te peta por el mismatch ");
            }

        }while (i < elvector.length );



    }
}
