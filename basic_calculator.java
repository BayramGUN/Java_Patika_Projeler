package com.example;

import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        int select;
        double num_one, num_two;
        Scanner s = new Scanner(System.in);
        System.out.print("Yapacaginiz islemi giriniz: \n 1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme \n");
        select = s.nextInt();
        System.out.print("ilk sayiyi giriniz: ");
        num_one = s.nextInt();
        System.out.print("ilk sayiyi giriniz: ");
        num_two = s.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam = " + (num_one + num_two));
                break;
            case 2:
                System.out.println("Cikarim = " + (num_one - num_two));
                break;
            case 3:
                System.out.println("Carpim = " + (num_one * num_two));
                break;
            case 4:
                System.out.println("Bolum = " + (num_one / num_two));
                break;
        }
    }
}
