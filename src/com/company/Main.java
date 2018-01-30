package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasyk du skaicius: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int suma = a + b;
        System.out.println("Suma: " + suma);
    }
}
