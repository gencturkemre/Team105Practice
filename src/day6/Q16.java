package day6;

import java.util.Scanner;

public class Q16 {
    static int bolum=0;

        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int bolunen = scan.nextInt();
        System.out.print("Lutfen bolen sayiyi giriniz : ");
        int bolen = scan.nextInt();

        System.out.println(bolunen + " / " + bolen + " = " + bol(bolunen, bolen));
    }

    public static int bol(int bolunen, int bolen) {

        while(bolunen>=bolen){
            bolunen-= bolen;
            bolum++;
        }
        return bolum;
    }
}
