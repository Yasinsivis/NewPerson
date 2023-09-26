package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  String userName,Password,sifre="Dev145", newPassword;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınıızı Giriniz:");
        userName=inp.nextLine();
        System.out.println("Lütfen Şifrenizi Giriniz:");
        Password=inp.nextLine();
        if (userName.equals("patika")&&Password.equals(sifre)) {
            System.out.println("Giriş Başarılı");
        }
        else {
            System.out.println("Bilgileriniz Yanlış, Şifrenizi Yenilemek İster misiniz? E, H");
            String select=inp.nextLine();
            if(select.equals("E") || select.equals("e")) {
                System.out.println("Lütfen Yeni Şifrenizi Giriniz:");
                newPassword = inp.nextLine();
                if(!newPassword.equals(sifre) && !newPassword.equals(Password))
                {
                    System.out.println("Şifre Değiştirme İşlemi Gayet başarılı Tekrardan Giriş yapabilirsiniz:");
                }
                else
                    System.out.println("Eski Şifrenizle Yeni Şifreniz Aynı Olamaz...");

            }
            else
                System.out.println("Program Kapatılıyor...");
        }






    }
}
