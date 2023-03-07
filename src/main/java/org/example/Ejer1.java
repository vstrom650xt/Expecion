package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,res;

        try{
            System.out.println("po num");
            a = sc.nextInt();
            System.out.println("po num");
            b = sc.nextInt();
            res =a/b;
            System.out.println("el res es " + res );

        }catch (InputMismatchException ime){
            System.err.println("hola , te peta por el mismatch ");
            ime.printStackTrace();
        }catch (ArithmeticException ae){
            System.err.println("hola , te peta por el aritmetic");
            ae.printStackTrace();

        }
    }
}
