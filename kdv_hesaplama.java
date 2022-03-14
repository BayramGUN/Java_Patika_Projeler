package com.example;
import java.util.*;

public class kdv_hesaplama {
    public static void main(String[] args) {
        double price, kdv_tax, tax_price, new_price;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Tutar giriniz: ");
        price = input.nextDouble();
        
        kdv_tax = (price >= 0 || price <= 1000) ? 0.18: 0.08;
        
        tax_price = price * kdv_tax;
        new_price = tax_price + price;
        
        System.out.println("Urun fiyati: " + price);
        System.out.println("KDV Tutari: " + tax_price);
        System.out.println("Urunun KDV li fiyati: " + new_price);
    }
}
