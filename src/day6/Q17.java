package day6;

import java.util.Scanner;

public class Q17 {
    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen her sayidan sonra Enter'a basarak bes sayi giriniz : ");

        int enBuyukSayi = 0;
        int sayac = 0 ;

        while (sayac<5){
            int sayi = scan.nextInt();
            if(sayi>enBuyukSayi){
                enBuyukSayi = sayi ;
            }
            sayac++;
        }
        System.out.println("Girilen sayilarin en buyugu = " + enBuyukSayi);
    }
}
