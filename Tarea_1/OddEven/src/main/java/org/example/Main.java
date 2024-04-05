package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        Scanner input = new Scanner(System.in);

        System.out.println("type a number: ");
        numero = input.nextInt();
        OddEven oddEven = new OddEven(numero);
        if (oddEven.isEven()) {
            oddEven.countEven();
        }else {
            oddEven.countOdd();
        }
    }
}