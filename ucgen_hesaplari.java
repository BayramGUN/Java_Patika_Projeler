package com.example;
import java.util.*;

public class ucgen_hesaplari {
    public static void main(String[] args) {
        double a, b, c,hipo, circum, area;
        Scanner num = new Scanner(System.in);
        System.out.print("Birinci dik kenarin uzunlugunu giriniz: ");
        a = num.nextDouble();
        System.out.print("İkinci dik kenarin uzunlugunu giriniz: ");
        b = num.nextDouble();
        hipo = Math.pow(a,2) + Math.pow(b,2);
        System.out.println("Hipotenus uzunlugu: " + Math.sqrt(hipo));

        System.out.print("Bir kenar uzunlugu giriniz: ");
        a = num.nextDouble();
        System.out.print("Bir kenar uzunlugu daha giriniz: ");
        b = num.nextDouble();
        System.out.print("Bir kenar uzunlugu daha giriniz: ");
        c = num.nextDouble();
        circum = (a + b + c) / 2;
        area = circum * (circum - a) * (circum - b) * (circum - c);
        area = Math.sqrt(area);
        if(area > 0){
            System.out.print("Kenar uzunluklarini girdiginiz ucgenin alani: " + area);
        }else
            System.out.print("Girdiğiniz değerler ile üçgen oluşturulamadi!");
    }
}
