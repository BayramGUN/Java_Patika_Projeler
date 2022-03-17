package com.example;

import java.util.Scanner;

public class daire_alani {
    public static void main(String[] args) {
        double r, alfa, area;
        Scanner num = new Scanner(System.in);

        System.out.print("Yari Capi Giriniz: ");
        r = num.nextDouble();

        System.out.print("Daire Dilminin Acisini Giriniz: ");
        alfa = num.nextDouble();

        area = (Math.PI * Math.pow(r,2) * alfa) / 360;

        System.out.println("Daire Diliminin Alani = " + area);
    }
}
