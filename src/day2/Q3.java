package day2;

import java.util.Scanner;

public class Q3 {
    /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */

        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double vize, finalNotu, devam;

        System.out.print("Vize notunuzu giriniz : ");
        vize = scan.nextDouble();
        System.out.print("Final notunuzu giriniz : ");
        finalNotu = scan.nextDouble();
        System.out.print("Devam notunuzu giriniz : ");
        devam = scan.nextDouble();


        double ort = (vize*0.1) + (finalNotu*0.8) + (devam*0.1);

        if (ort>100 || ort<0){
            System.out.println("Yanlis giris yaptiniz, lutfen gecerli degerler giriniz!!!!!");
        }else if(ort>=70){
            System.out.println("Ortalamaniz = " + ort +" Tebrikler, caliskan Nesrin");}
        else if(ort>=60){
            System.out.println("Ortalamaniz = " + ort +" Sartli gectiniz, Agno'nuz 1.8'in uzerinde ise gecmis olursunuz");
        }else System.out.println("Ortalamaniz = " + ort +" Bu sefer olmadi seneye Mujgan :'(");
    }
}
