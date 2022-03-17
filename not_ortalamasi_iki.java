package com.example;

import java.util.Scanner;

public class not_ortalamasi_iki {
    public static void main(String[] args) {
        double average;
        double math, music, chem, physic, turkish;
        int i = 0;
        Scanner num = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        math = num.nextInt();
        if(!(math <= 100 && math >= 0)){
            math = 0;
        }else i++;
        System.out.println("Fizik Notunuzu Giriniz: ");
        physic = num.nextInt();
        if(!(physic <= 100 && physic >= 0)){
            physic = 0;
        }else i++;
        System.out.println("Kimya Notunuzu Giriniz: ");
        chem = num.nextInt();
        if(!(chem <= 100 && chem >= 0)){
            chem = 0;
        }else i++;
        System.out.println("Turkçe Notunuzu Giriniz: ");
        turkish = num.nextInt();
        if(!(turkish <= 100 && turkish >= 0)){
            turkish = 0;
        }else i++;

        System.out.println("Muzik Notunuzu Giriniz: ");
        music = num.nextInt();
        if(!(music <= 100 && music >= 0)){
            music = 0;
        }else i++;
        average = (math + music + physic + chem + turkish) / i;
        System.out.println("Notlarin ortalamasi: " + average);
        boolean conc = average >= 55;
        System.out.println((conc) ? "Sinifi gecti!" : "Sinifta kaldi!");
    }
}
