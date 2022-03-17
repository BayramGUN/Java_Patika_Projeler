package com.example;

import java.util.Scanner;

public class manav_reyonu {
    public static  class ManavReyonu {
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlican = 5.00;
    }
    public static void main(String[] args) {
        ManavReyonu reyon = new ManavReyonu();
        double kilo;
        double total = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Armut KG: ");
        kilo = num.nextDouble();
        total += kilo * reyon.Armut;
        System.out.print("Domates KG: ");
        kilo = num.nextDouble();
        total += kilo * reyon.Domates;
        System.out.print("Muz KG: ");
        kilo = num.nextDouble();
        total += kilo * reyon.Muz;
        System.out.print("Patlıcan KG: ");
        kilo = num.nextDouble();
        total += kilo * reyon.Patlican;
        System.out.print("Elma KG: ");
        kilo = num.nextDouble();
        total += kilo * reyon.Elma;

        System.out.println("Toplam Tutar = " + total);
    }
}
