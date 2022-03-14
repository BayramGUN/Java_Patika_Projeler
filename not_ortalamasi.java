package com.example;
import java.util.*;

public class not_ortalamasi {
    public static void main(String[] args) {
        int average;
        int math, music, chem, physic, turkish, hist;
        Scanner num = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        math = num.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        physic = num.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        chem = num.nextInt();

        System.out.println("Turkçe Notunuzu Giriniz: ");
        turkish = num.nextInt();

        System.out.println("Tarih Notunuzu Giriniz: ");
        hist = num.nextInt();

        System.out.println("Muzik Notunuzu Giriniz: ");
        music = num.nextInt();
        average = (math + music + hist + physic + chem + turkish) / 6;
        System.out.println("Notlarin ortalamasi: " + average);
        conc = average >= 60;
        System.out.println((conc) ? "Sinifi gecti!" : "Sinifta kaldi!");
    }
}
