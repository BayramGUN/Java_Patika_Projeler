package com.example;
import java.util.*;

public class sayi_islemleri {
    public static void main(String[] args) {
        int n, sum = 0, counter = 0, average = 0;
        Scanner num = new Scanner(System.in);

        System.out.println("Sayi Giriniz: ");
        n = num.nextInt();
        for(int i = 1; i <= n; i++) {
            if((i % 4) == 0 && (i % 3) == 0){
                sum += i;
                counter++;
            }
        }
        average = sum / counter;
        System.out.println("3 e ve 4 e tam bolunen sayilarin ortalamasi: " + average);
    }
}
