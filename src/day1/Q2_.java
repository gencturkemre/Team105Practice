package day1;

public class Q2_ {
    /*
    76453 sayisinin her bir basamagini konsolda alt alta yazdirin.

    input : 76453
    output: 7
            6
            4
            5
            3

     */

    public static void main(String[] args) {

        int sayi = 23618;

        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) % 10;
        int binler = (sayi / 1000) % 10;
        int onbinler = (sayi / 10000) % 10;

        System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);
    }
}
