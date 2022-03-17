package com.example;

import java.util.Scanner;

public class nonsecure_auth {
    public static void main(String[] args) {
        String userNameIn, userName = "UserName",passwordIn, password = "sifre123", passwordNew;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adiniz: ");
        userNameIn = input.nextLine();

        if(userNameIn.equals(userName)){
            System.out.print("Sifreniz: ");
            passwordIn = input.nextLine();
            if (passwordIn.equals(password)){
                System.out.print("Giris Basarili!");
            }else
                System.out.print("Sifrenizi sifirlamak ister misiniz? \n 1-Evet \n 2-Hayir \n 3-Cikis \n");
                int sec;
                sec = input.nextInt();
            switch (sec){
                case 1:
                    System.out.print("Yeni Sifre giriniz: ");
                    Scanner input2 = new Scanner(System.in);
                    passwordNew = input2.nextLine();
                    if (passwordNew.equals(password))
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    else
                        System.out.print("Şifre Oluşturuldu.");
                    break;
                case 2:
                    System.out.print("Sifrenizi degistirmek istemediginizi belirttiniz.");
                    break;
                case 3:
                    break;
            }
        }else
            System.out.print("Kullanici bulunamadi!");
    }
}
