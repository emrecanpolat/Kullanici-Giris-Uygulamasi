package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username,password,newPassword;
        int sifreDegistirme;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("emre") && password.equals("1234")){
            System.out.println("Giriş başarılı");
        }else {
            System.out.println("hatalı bilgi girdiniz, şifrenizi sıfırlamak için 1 giriniz");
            sifreDegistirme = input.nextInt();
            if (sifreDegistirme==1){
                System.out.println("Yeni şifrenizi giriniz(Eski şifreniz ile aynı olamaz): ");
                newPassword = input.next();
                password = newPassword;
                System.out.println("Kullanıcı adınızı giriniz: ");
                username = input.next();

                System.out.println("Şifrenizi giriniz: ");
                password = input.next();
            }
            if (username.equals("emre") && password.equals(password)){
                System.out.print("Giriş başarılı");


            }

        }



}}
