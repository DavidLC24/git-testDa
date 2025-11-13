package algo;

import java.util.Scanner;

public class Ejem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número double");
        double d1 = scanner.nextDouble();
        System.out.println("Escribe otro número double");
        double d2 = scanner.nextDouble();
        double division = d1 / d2;
        System.out.println(division);
}}
